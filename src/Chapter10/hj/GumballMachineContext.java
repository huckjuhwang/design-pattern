package Chapter10.hj;

public class GumballMachineContext {
    int count;
    State state;

    GumballMachineContext(int count) {
        this.count = count;
        if(count > 0) {setStatus(State.NO_QUARTER);} else {setStatus(State.SOLD_OUT);}
    }

    public void setStatus(State state) {
        this.state = state;
    }


    public void insertQuarter() {
        state.getInstance().insertQuarter(this);
    }


    public void ejectQuarter(){
        state.getInstance().ejectQuarter(this);
    }


    public void turnCrank(){
        if(state.getInstance().turnCrank(this)){
            state.getInstance().dispense(this);
        }
    }

    public void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if(count > 0) {
            count--;
        }
    }

    @Override
    public String toString() {
        return """
                
                ======================
                주식회사 왕뽑기 
                자바로 돌아가는 최신형 뽑기 기계
                남은 개수: %s
                동전 투입 대기중
                ======================
                """.formatted(count);
    }

}
