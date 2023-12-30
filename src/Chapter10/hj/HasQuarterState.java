package Chapter10.hj;

public class HasQuarterState implements StateAction {
    @Override
    public void insertQuarter(GumballMachineContext gm) {
        System.out.println("동전을 한개만 넣어주세요");
    }

    @Override
    public void ejectQuarter(GumballMachineContext gm) {
        System.out.println("동전이 반환됩니다.");
        gm.setStatus(State.HAS_QUARTER);
    }

    @Override
    public boolean turnCrank(GumballMachineContext gm) {
        System.out.println("손잡이를 돌렸습니다.");
        gm.setStatus(State.SOLD);
        return true;
    }

    @Override
    public void dispense(GumballMachineContext gm) {
        System.out.println("알맹이를 내보낼 수 없습니다.");
    }
}
