package Chapter6.hj.basic;

public class ConcreteCommend implements Commend {

    Receiver receiver;

    ConcreteCommend(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public void undo() {
        receiver.undo();
    }
}
