## 옵저버패턴
한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고
자동으로 내용이 갱신되는 방식되도록 즉, 객체간의 일대다 종속성을 정의하는 패턴입니다.

### 옵저버 패턴의 구조
<img width="800" alt="image" src="image/p2.png">

### 1. 옵저버 패턴을 사용해야하는 이유
예를 들어 기상 모니터링 애플리케이션을 개발

구성 요소
1. 기상 스테이션(실제 기상 정보를 수집)
2. weatherData 객체 (기상스테이션으로 부터 오는 데이터를 축적)
3. 사용자에게 현재 기상 조건을 보여주는 디스플레이

<img width="600" alt="image" src="image/p1.png">

이런 구성으로 되어있고 위 구성을 표현한 코드


```java
public class WeatherData {

  // 기상 관측값이 갱신될 때 마다 알려주기 위한 메소드
	public void measurementChanged() {
	float temp = getTemperture();
	float humidity = getHumidity();
	float pressure = getPressure();

	// 각 디스플레이 항목을 불러서 디스플레이를 갱신 메소드
	currentConditionDisplay.update(temp, humidity, pressure);
	statisticsDisplay.update(temp, humidity, pressure);
	forecastDisplay.update(temp, humidity, pressure);
	}
}

```
**문제점**
구체적인 구현에 맞춰서 코딩했기 때문에 프로그램을 고치지 않고
다른 디스플레이 항목을 추가하거나 제거 할 수 없습니다.

**이 문제를 해결하기 위해서 옵저버 패턴을 사용할 수 있습니다.**


### 2. 옵져버 패턴 구현
```java
public interface Subject {
  // 각각 옵저버를 등록하고 제거하는 역할 메소드
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);

  // 주제의 상태가 변경됬을때 모든 옵저버에게 변경 내용을 알리려고 호출되는 메소드
  public void notifiyObservers();
}
public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
public interface DisplayElement {
  // 디스플레이 항목을 화면에 표시할 경우 호출
	public void display();
}

```

```java
public interface Subject {
  // 각각 옵저버를 등록하고 제거하는 역할 메소드
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);

  // 주제의 상태가 변경됬을때 모든 옵저버에게 변경 내용을 알리려고 호출되는 메소드
  public void notifiyObservers();
}
public interface Observer {
  // 기상 정보가 변경 되었을때 옵저버에 전달되는 상태값들
	public void update(float temp, float humidity, float pressure);
}
public interface DisplayElement {
  // 디스플레이 항목을 화면에 표시할 경우 호출
	public void display();
}

```


### 3. 풀방식으로 코드를 바꿔보기


### Q1. 

### Q2. 


