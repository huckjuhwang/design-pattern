package Chapter1.hj.code;

import Chapter1.hj.code.Duck.Duck;
import Chapter1.hj.code.Duck.MuteQuack;
import Chapter1.hj.code.Duck.Quack;

public class Client {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setQuickBehavior(new MuteQuack());
        duck.cry();  // ...(MuteQuack)

        // ... 1개월 후, 소리를 낼수 있을 정도로 크게 되었다.

        duck.setQuickBehavior(new Quack());
        duck.cry();  // Quack Quack(꽉꽉!~)
    }
}
