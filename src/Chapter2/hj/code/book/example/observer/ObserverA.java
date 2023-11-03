package Chapter2.hj.code.book.example.observer;

import Chapter2.hj.code.book.example.subject.SubjectImpl;

public class ObserverA extends SubjectImpl implements Observer {
    @Override
    public void update() {
        System.out.println("update observer A");
    }
}
