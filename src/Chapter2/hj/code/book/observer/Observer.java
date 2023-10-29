package Chapter2.hj.code.book.observer;

import Chapter2.hj.code.book.subject.Weather;

public interface Observer {

    /**
     * 옵저버들에게 행동 변화를 전달한다.
     */
    public void notifyForStatusChange(Weather weather);


    /**
     * 옵저버 등록을 해지한다.
     */
    public void deleteObserver();
}
