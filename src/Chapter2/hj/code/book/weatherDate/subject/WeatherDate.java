package Chapter2.hj.code.book.weatherDate.subject;

import Chapter2.hj.code.book.weatherDate.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherDate implements Subject {
    private List<Observer> observers;
    private Weather weather;

    public void WeatherDate() {
        observers = new ArrayList<>();
        weather = new Weather();
    }

    /**
     * 날씨 상태가 변경되는 시점에 해당 메서드가 호출된다.
     */
    public void measurementsChanged() {
        this.notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.notifyForStatusChange(weather));
    }
}
