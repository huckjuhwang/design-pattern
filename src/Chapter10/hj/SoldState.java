package Chapter10.hj;

public class SoldState implements StateAction {
    @Override
    public boolean accept(State state) {
        return State.SOLD == state;
    }

    @Override
    public void insertQuarter(GumballMachine gm) {
        System.out.println("알맹이를 내보내고 있습니다.");
    }

    @Override
    public void ejectQuarter(GumballMachine gm) {
        System.out.println("이미 알맹이를 뽑으셨습니다.");
    }

    @Override
    public boolean turnCrank(GumballMachine gm) {
        System.out.println("손잡이는 한번만 돌려주세요");
        return false;
    }

    @Override
    public void dispense(GumballMachine gm) {
        gm.releaseBall();

        if(gm.count > 0) {
            gm.setStatus(State.NO_QUARTER);
        } else {
            System.out.println("Oops, out of gumballs!");
            gm.setStatus(State.SOLD_OUT);
        }
    }
}
