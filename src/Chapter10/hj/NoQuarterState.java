package Chapter10.hj;

public class NoQuarterState implements StateAction {
    @Override
    public void insertQuarter(GumballMachineContext gm) {
        System.out.println("동전을 넣었습니다.");
        gm.setStatus(State.HAS_QUARTER);
    }

    @Override
    public void ejectQuarter(GumballMachineContext gm) {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public boolean turnCrank(GumballMachineContext gm) {
        System.out.println("동전을 넣어주세요");
        return false;
    }

    @Override
    public void dispense(GumballMachineContext gm) {
        System.out.println("동전을 넣어주세요");
    }
}
