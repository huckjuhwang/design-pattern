package Chapter2.hj.code.book.weatherDate.observer;

import Chapter2.hj.code.book.weatherDate.subject.Weather;
import Chapter2.hj.code.book.weatherDate.subject.WeatherDate;

public class CurrentConditionsDisplay extends WeatherDate implements Observer, DisplayElement {
    private WeatherDate weatherDate;
    private Weather weather;

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay class의 display 메서드를 실행합니다.");
    }


    public CurrentConditionsDisplay(WeatherDate weatherDate) {
        this.weatherDate = new WeatherDate();
        weatherDate.addObserver(this);
    }

    @Override
    public void deleteObserver() {
        this.deleteObserver();
    }

    @Override
    public void notifyForStatusChange(Weather weather) {
        this.weather = weather;
        System.out.println("상태가 변경되었습니다.");
        display();
    }
}
