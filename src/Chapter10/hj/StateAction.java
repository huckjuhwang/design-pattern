package Chapter10.hj;

interface StateAction {
    // 코인을 넣는다
    public void insertQuarter(GumballMachineContext gm);
    // 코인을 반환한다.
    public void ejectQuarter(GumballMachineContext gm);
    // 손잡이를 돌린다.
    public boolean turnCrank(GumballMachineContext gm);
    // 뽑기 상품 전달
    public void dispense(GumballMachineContext gm);
}
