package Chapter1.hj.code.Duck;


public class Quack implements QuackBehavior {

    @Override
    public void cry() {
        System.out.println("Quack Quack(꽉꽉!~)");
    }
}