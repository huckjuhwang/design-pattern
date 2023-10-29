package Chapter2.hj.code.book.subject;

import Chapter2.hj.code.book.observer.Observer;

public interface Subject {

    /**
     * 신규 옵저버를 구독한다.
     */
    public void addObserver(Observer observer);


    /**
     * 기존 옵저버를 삭제한다.
     */
    public void deleteObserver(Observer observer);


    /**
     * 상태 변경으로 알림을 옵저버들에게 알림을 전달한다.
     */
    public void notifyObservers();
}
