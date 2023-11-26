## 싱글톤 패턴 
특정 클래스가 인스턴스(객체 생성)될때 오직 하나의 인스턴스만 존재하도록 보장하는 패턴입니다.

### 싱글톤 패턴의 구조
<img width="800" alt="image" src="image/s1.png">

### 1. 싱글톤 패턴을 사용하는 이유
스레드 풀, 캐시, 로그기록용 객체 특정 디바이스 드라이버 이런 형식의 객체를 사용할 때 인스턴스가 2개 이상 생성되면
불필요하게 리소스를 차지하거나 일관성이 없어지는 문제가 발생할 수 있습니다. 따라서 이러한 객체들은 유일하게
관리하기 위해서는 인스턴스가 1개만 생성되게 해야합니다.

### 2. 간단한 싱글톤 패턴 구현
```java
public class Singleton{
	private static Singleton singleton;
	private Singleton()
  {

  }

	public static Singleton getInstance(){
		if(singleton == null){
			singleton = new Singleton;
		}
		return singleton;
	}
}
```

#### 간단한 싱글톤 패턴의 문제점
<img width="800" alt="image" src="image/s2.png">
사진과 같이 멀티 스레드 환경에서는 스레드가 서로 다른 객체의 참조를 가질 수 있습니다. 따라서 한번에 하나의 스레드가 접근 할 수있도록 동기화가 필요합니다.



### 2.1 Synchronized 이용
```java
public class Singleton{
	private static Singleton singleton;
	private Singleton(){}

	public static synchronized Singleton getInstance(){
		if(singleton == null){
			singleton = new Singleton;
		}
		return singleton;
	}
}
```
synchronized를 사용하면 1나노초라도 늦게 호출한 스레드가 이전 스레드가 사용을 끝낼때까지 대기후에 호출됩니다.
하지만 Synchronized 이용하는 방식에도 단점이 있습니다.

동기화가 필요한 시점은 처음 인스턴스의 생성 시점이기 때문에 인스턴스가 생성된 후에는 동기화를 유지할 필요없으나 위 코드는 모든 순간마다 동기화를 하기 때문에 불필요한 오버헤드 증가로 인해 속도가 저하됩니다.



### 2.2 초기에 Sington 인스턴스 생성
```java
public class Singleton{
	private static Singleton singleton = new Singleton;
	private Singleton(){}

	public static synchronized Singleton getInstance(){
		return singleton;
	}
}
```
클래스가 로딩될때 즉 초기에 인스턴스가 성생되도록해 놓는 방법이 있습니다. 이 방법을 사용하면 synchronized로 인한 속도 저하 문제가 해결됩니다. 하지만 초기에 인스턴스를 생성하는것도 단점이 있습니다.

에플리케이션 시작 시점에 인스턴스가 생성되기때문에 만약에 사용하지 않을 경우에는 자원이 낭비가 됩니다.


### 2.3 DCL(Double-checked Loking)
```java
public class Singleton{
	private volatile static Singleton singleton;
	private Singleton(){}

	public static synchronized Singleton getInstance(){
		if(singleton == null){
			synchronized (Singlton.class){
				if(singleton == null){
					singleton = new Singleton;
				}
			}
		}
		return singleton;
	}
}
```
DLC 방식을 사용하면 singleton 이 null 인 경우에만 synchronized 가 적용됩니다.
객체가 생성된 후에 synchronized 체크를 하지 않기때문에 속도 저하 문제가 해결됩니다.

volatile은 multi Thread 환경에서 변수 값을 Read 할때 CPU cache가 아닌 메인 메모리에서 값을 읽고 사용합니다.
Multi Thread 어플리케이션에서는 성능 향상을 위해 CPU cache를 사용하는데 이때 발생하는 변수값 불일치 문제를 해결할 수 있습니다. 다만 cache를 이용하지 않는 만큼 성능에 영향을 줄 수 있으니 필요할 경우에만 사용해야 합니다.

### 3. 직렬화
클래스를 직렬화 하면 새 인스턴스가 생성되어 싱글턴 속성을 위한하게 됩니다.
따라서 해결하기 위한 3지 방법이 있습니다.

* 싱글톤 오브젝트를 직렬화 하기 위해 implements Serializable을 추가합니다.
* readResolve() 메서드를 구현합니다

```java
private Object readResolve(){
	return singleton;
}
```


### 4. enum을 사용한 싱글턴 패턴 구현
enum 인스턴스의 생성은 기본적으로 thread safe 입니다.
enum 타입은 기본적으로 직렬화가 가능하기때문에 Serializable 인터페이스를 구현할 필요가 없습니다.
enum 사용은 인스턴스가 JVM 내에 하나만 존재한다는것이 100% 보장되기 떄문에 java에서 싱글톤을 만드는 가장 좋은 방법입니다.

```java
public enum SingletonEnum {
    INSTANCE;
    int value;
    
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
public class EnumDemo {
    
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }
}
```


### Q1.
Enum을 사용한 로깅 시스템을 싱글톤 패턴으로 간단하게 구현
- 간단하게 코드를 작성한다.
- 그 코드에 맞게 상호작용을 설명한다.




