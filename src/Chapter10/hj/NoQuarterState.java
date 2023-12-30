package Chapter10.hj;

public class NoQuarterState implements StateAction {
    @Override
    public boolean accept(State state) {
        return State.NO_QUARTER == state;
    }

    @Override
    public void insertQuarter(GumballMachine gm) {
        System.out.println("동전을 넣었습니다.");
        gm.setStatus(State.HAS_QUARTER);
    }

    @Override
    public void ejectQuarter(GumballMachine gm) {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public boolean turnCrank(GumballMachine gm) {
        System.out.println("동전을 넣어주세요");
        return false;
    }

    @Override
    public void dispense(GumballMachine gm) {
        System.out.println("동전을 넣어주세요");
    }
}
