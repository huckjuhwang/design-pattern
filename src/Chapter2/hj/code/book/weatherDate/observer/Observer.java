package Chapter2.hj.code.book.weatherDate.observer;

import Chapter2.hj.code.book.weatherDate.subject.Weather;

public interface Observer {
    public void notifyForStatusChange(Weather weather);
    public void deleteObserver();
}
