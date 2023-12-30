package Chapter10.hj;

interface StateAction {
    public boolean accept(State state);

    // 코인을 넣는다
    public void insertQuarter(GumballMachine gm);
    // 코인을 반환한다.
    public void ejectQuarter(GumballMachine gm);
    // 손잡이를 돌린다.
    public boolean turnCrank(GumballMachine gm);
    // 뽑기 상품 전달
    public void dispense(GumballMachine gm);
}
