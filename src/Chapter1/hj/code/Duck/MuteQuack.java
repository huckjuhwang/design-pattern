package Chapter1.hj.code.Duck;

public class MuteQuack implements QuackBehavior {
    @Override
    public void cry() {
        System.out.println("...(MuteQuack)");
    }
}
