package Chapter2.hj.code.observer;

import Chapter2.hj.code.subject.Weather;

public interface Observer {

    /**
     * 옵저버들에게 행동 변화를 전달한다.
     */
    public void notifyForStatusChange(Weather weather);
}
