package Chapter2.hj.code.subject;

public class Weather {
    public float temperature;  // 온도
    public float humidity;   // 습도
    public float pressure;  // 기압

    public Weather(){

    }

    public Weather(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
