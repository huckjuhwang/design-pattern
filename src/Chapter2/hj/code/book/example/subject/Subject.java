package Chapter2.hj.code.book.example.subject;

import Chapter2.hj.code.book.example.observer.Observer;

public interface Subject {

    /**
     * 신규 옵저버 구독
     */
    public void saveObserver(Observer observer);

    /**
     * 기존 옵저버 해제
     */
    public void deleteObserver(Observer observer);

    /**
     * 변경 알림
     */
    public void notifyObservers();
}
