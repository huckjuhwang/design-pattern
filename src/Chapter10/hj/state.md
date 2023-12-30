## 상태 패턴(State Pattern)

----

`상태 패턴(State Pattern)`을 사용하면 객체의 내부상태가 바뀜에 따라서 객체의 행동을 바꿀수 있다.
마치 객체의 클래스가 바뀌는것 과 같은 결과을 얻을수 있는 것이다.


```java
여기서 '상태' 란, 객체가 가질 수 있는 어떤 조건이나 상황을 의미한다.
예를들어 자판기에서 레버를 돌리면 음료수가 나오게된다.
하지만 동전이 들어가 있지 않은 상태라면 레버를 돌린다고 하더라도 음료수가 나오지 않는다
  즉, 자판기의 상태에 따라 메소드 행동이 바뀌는 것이다.

이처럼 객체가 특정 상태에 따라 행위를 달리하는 상황에서 사용되는 최적의 패턴이 state pattern 이라고 보면 된다.
```


### 상태 패턴 구조

---
![](https://velog.velcdn.com/images/huckjuhwang/post/aa6bfbdd-f23b-44cc-a783-1476b17f6d1b/image.png)

- `Context` : State에 따른 적절한 ConcreteState를 선택해주고, 호출 직후 State가 변하는 경우에 처리를 해준다.
- `State`: 각 State에 따른 행위들을 인터페이스를 정의한다.
- `ConcreteState`: 구체적인 각각의 상태를 클래스로 표현. State 역할로 결정되는 인터페이스(API)를 구체적으로 구현한다. 다음 상태가 결정되면 Context에 상태 변경을 요청하는 역할도 한다.


이렇게만 보면, 이전에 포스팅 했던 전략패턴과 유사한 형태로도 보이는데 명확한 차이가 있다.

### 전략 패턴 vs 상태 패턴

---
전략 패턴은 클라이언트가 맞는 전략을 선택한 후에 Context에 전달을 해줬다면,
- `상태 패턴`에서는 Context 객체에서 상태들이 캡슐화가 됩니다. Context 내부에서 상태들이 관리되다보니, 클라이언트는 해당 상태들을 알 필요가 없습니다.
- 하지만 `전략 패턴`에서는 클라이언트가 Context 객체로 어떤 전략을 선택할지 결정해줍니다.

**정리**

---
- `전략 패턴` => 한 번 인스턴스를 생성하고 나면, 상태가 거의 바뀌지 않는 경우에 사용한다.
- `상태 패턴` =>  한 번 인스턴스를 생성하고 난 뒤, 상태를 바꾸는 경우가 빈번한 경우에 사용한다.


### 상태 패턴 구현해보기
- 상태(행위)를 객체화 해야한다
  ![](https://velog.velcdn.com/images/huckjuhwang/post/2bea5c16-65cb-43b7-8b88-c25b746c8d64/image.png)

- 여기서의 행위는 총 4가지가 존재한다.
```text
NoQuarterState -> 동전이 없는 상태
HasQuarterState -> 동전을 넣은 상태
SoldState -> 상품 판매중 상태
SoldOutState -> 품절 상태
```

![](https://velog.velcdn.com/images/huckjuhwang/post/9d916c6a-ee71-4b14-89d9-3d695588f459/image.png)

- 상태 State에 따른 구현체는 enum클래스 타입에 싱글톤 형태로 작성되어 있다.


```java
interface StateAction {
    // 코인을 넣는다
    public void insertQuarter(GumballMachine gm);
    // 코인을 반환한다.
    public void ejectQuarter(GumballMachine gm);
    // 손잡이를 돌린다.
    public boolean turnCrank(GumballMachine gm);
    // 뽑기 상품 전달
    public void dispense(GumballMachine gm);
}


public class NoQuarterState implements StateAction {
    @Override
    public void insertQuarter(GumballMachine gm) {
        System.out.println("동전을 넣었습니다.");
        gm.setStatus(State.HAS_QUARTER);
    }

    @Override
    public void ejectQuarter(GumballMachine gm) {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public boolean turnCrank(GumballMachine gm) {
        System.out.println("동전을 넣어주세요");
        return false;
    }

    @Override
    public void dispense(GumballMachine gm) {
        System.out.println("동전을 넣어주세요");
    }
}

public class SoldState implements StateAction {
    @Override
    public void insertQuarter(GumballMachine gm) {
        System.out.println("알맹이를 내보내고 있습니다.");
    }

    @Override
    public void ejectQuarter(GumballMachine gm) {
        System.out.println("이미 알맹이를 뽑으셨습니다.");
    }

    @Override
    public boolean turnCrank(GumballMachine gm) {
        System.out.println("손잡이는 한번만 돌려주세요");
        return false;
    }

    @Override
    public void dispense(GumballMachine gm) {
        gm.releaseBall();

        if(gm.count > 0) {
            gm.setStatus(State.NO_QUARTER);
        } else {
            System.out.println("Oops, out of gumballs!");
            gm.setStatus(State.SOLD_OUT);
        }
    }
}

...
```
- 구현체의 모든 코드는 넣지 않으려고 한다.

```java
public class GumballMachineContext {
    int count;
    State state;
    
    GumballMachineContext(int count) {
        this.count = count;
        if(count > 0) {setStatus(State.NO_QUARTER);} else {setStatus(State.SOLD_OUT);}
    }

    public void setStatus(State state) {
        this.state = state;
    }


    public void insertQuarter() {
        state.getInstance().insertQuarter(this);
    }


    public void ejectQuarter(){
        state.getInstance().ejectQuarter(this);
    }


    public void turnCrank(){
        if(state.getInstance().turnCrank(this)){
            state.getInstance().dispense(this);
        }
    }

    public void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if(count > 0) {
            count--;
        }
    }

    @Override
    public String toString() {
        return """
                
                ======================
                주식회사 왕뽑기 
                자바로 돌아가는 최신형 뽑기 기계
                남은 개수: %s
                동전 투입 대기중
                ======================
                """.formatted(count);
    }

}
```
``` java
enum State {
    SOLD_OUT(SoldOutState::new),
    NO_QUARTER(NoQuarterState::new),
    HAS_QUARTER(HasQuarterState::new),
    SOLD(SoldState::new);

    private Supplier<StateAction> actions;

    public StateAction getInstance() {
        return actions.get();
    }

    State(Supplier<StateAction> actions) {
        this.actions = actions;
    }
}

```

```java
public class Client {

    public static void main(String[] args) {
        GumballMachineContext gm = new GumballMachineContext(3);
        System.out.println(gm);

        gm.insertQuarter();
        gm.turnCrank();

        System.out.println(gm);

        gm.insertQuarter();
        gm.turnCrank();
        gm.insertQuarter();
        gm.turnCrank();

        System.out.println(gm);
    }
}
```

### 결과
![](https://velog.velcdn.com/images/huckjuhwang/post/80608058-6fa0-4fff-8130-74aaa03fcd47/image.png)



### 특징

---
**상태 패턴 사용 시기**

- 객체의 행동(메서드)가 상태(state)에 따라 각기 다른 동작을 할때.
- 상태 및 전환에 걸쳐 대규모 조건 분기 코드와 중복 코드가 많을 경우
- 조건문의 각 분기를 별도의 클래스에 넣는것이 상태 패턴의 핵심
- 런타임단에서 객체의 상태를 유동적으로 변경해야 할때

**상태 패턴 장점**

- 상태(State)에 따른 동작을 개별 클래스로 옮겨서 관리 할 수 있다.
- 상태(State)와 관련된 모든 동작을 각각의 상태 클래스에 분산시킴으로써, 코드 복잡도를 줄일 수 있다.
- `단일 책임 원칙`을 준수할 수 있다. (특정 상태와 관련된 코드를 별도의 클래스로 구성)
- `개방 폐쇄 원칙`을 준수 할 수 있다. (기존 State 클래스나 컨텍스트를 변경하지 않고 새 State를 도입할 수 있다)
- 하나의 상태 객체만 사용하여 상태 변경을 하므로 일관성 없는 상태 주입을 방지하는데 도움이 된다.

**상태 패턴 단점**

- 상태 별로 클래스를 생성하므로, 관리해야할 클래스 수 증가
- 상태 클래스 갯수가 많고 상태 규칙이 자주 변경된다면, Context의 상태 변경 코드가 복잡해지게 될 수 있다.
- 객체에 적용할 상태가 몇가지 밖에 없거나 거의 상태 변경이 이루어지지 않는 경우 패턴을 적용하는 것이 과도할 수 있다.