package Chapter2.hj.code.book.example;

import Chapter2.hj.code.book.example.observer.Observer;
import Chapter2.hj.code.book.example.observer.ObserverA;
import Chapter2.hj.code.book.example.observer.ObserverB;
import Chapter2.hj.code.book.example.subject.Subject;
import Chapter2.hj.code.book.example.subject.SubjectImpl;

public class Client {

    /**
     * 클래스 흐름
     * @param args
     */
    public static void main(String[] args) {
        // 발행자 등록
        Subject subject = new SubjectImpl();

        // 구독할 옵저버 등록
        Observer A = new ObserverA();
        Observer B = new ObserverB();
        subject.saveObserver(A);
        subject.saveObserver(B);

        // 변경 알림 전송
        subject.notifyObservers();

        // obserber B 구독취소
        subject.deleteObserver(B);

        // 옵저버 A한테만 알림 전송
        subject.notifyObservers();
    }
}
