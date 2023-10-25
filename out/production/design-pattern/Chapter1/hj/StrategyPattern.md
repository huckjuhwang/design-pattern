## 전략패턴
객체들이 할수 있는 행위들을 각각의 집합(전략)으로 만들어놓고, 
변경이 예상되는 부분은 전략을 바꾸는것 만으로 행위의 수정이 가능하도록 만든 패턴입니다.



### 1. 전략패턴을 사용해야하는 이유

오리(Duck)가 있고, 이 오리는 꽉꽉(Quack)또는 소리를 못내는(MuteQuack) 오리일수도 있습니다.

이 구조를 그려보면 


이와같이 구성이 가능되고, 위 구조를 프로그래밍 언어로 표현해 보면 다음과 같습니다.

```java
public interface QuackBehavior {
    public void cry();
}

public class Quack implements QuackBehavior {
    @Override
    public void cry() {
        System.out.println("Quack Quack(꽉꽉!~)");
    }
}

public class MuteQuack implements QuackBehavior {
    @Override
    public void cry() {
        System.out.println("...(MuteQuack)");
    }
}
```



여기서의 문제점은 특정 구현에 맞춰서 프로그래밍을 하게 되므로, runTime 시점에 유연하게 변경이 불가능하고, 
이로인해서 OCP(Open Closed Principle)를 위배하게 됩니다.


이와 같은 문제를 해결하기 위해서 전략패턴을 사용할수 있습니다.


### 2. 전략 패턴 구현
전략패턴을 사용하여 어떻게 해결할수 있냐면

오리(Duck)클래스에서 어떻게 소리를 낼 전략을 선택하고 그 값을 셋팅할수 있는 인터페이스를 공개해주면 됩니다.
- 여기서의 전략은 꽉꽉(Quack), 소리를 못내는(MuteQuack) 2가지중에 한가지를 선택할 수 있을겁니다.

```java

public class Duck {
    private QuackBehavior quackBehavior;
    
    public void setQuickBehavior(QuackBehavior quickBehavior){
        this.quickBehavior = quickBehavior;
    }

    /**
     * 오리(Duck)를 울게 할수 있는 메서드
     * @return
     */
    public String cry() {
        
    }
}
```

이제 client 입장에서 원하는 Duck의 소리를 내도록 구현해보면 다음과 같습니다.

```java
public class main {
    public static void main(String[] args) {
        Duck duck = 
    }
}

```