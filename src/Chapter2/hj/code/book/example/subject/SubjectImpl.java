package Chapter2.hj.code.book.example.subject;

import Chapter2.hj.code.book.example.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {
    private List<Observer> observers;

    public SubjectImpl() {
        observers = new ArrayList<>();
    }

    @Override
    public void saveObserver(Observer observer) {
        observers.add(observer);
        System.out.println("구독 완료!");
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("해지 완료!");
    }

    @Override
    public void notifyObservers() {
        observers.forEach( observer -> {
            observer.update();
        });
    }
}
