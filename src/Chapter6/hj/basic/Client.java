package Chapter6.hj.basic;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Receiver receiver = new Receiver();
        ConcreteCommend commend = new ConcreteCommend(receiver);

        invoker.setCommend(commend);
        invoker.buttonClick();
    }
}
