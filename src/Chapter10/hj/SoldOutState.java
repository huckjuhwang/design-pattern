package Chapter10.hj;

public class SoldOutState implements StateAction {
    @Override
    public boolean accept(State state) {
        return State.SOLD_OUT == state;
    }

    @Override
    public void insertQuarter(GumballMachine gm) {
        System.out.println("죄송합니다 매진되었습니다.");
    }

    @Override
    public void ejectQuarter(GumballMachine gm) {
        System.out.println("동전을 반환할 수 없습니다. 동전을 넣지 않았습ㄴ다.");
    }

    @Override
    public boolean turnCrank(GumballMachine gm) {
        System.out.println("매진되었습니다.");
        return false;
    }

    @Override
    public void dispense(GumballMachine gm) {
        System.out.println("내보낼수 없습니다.");
    }
}
