package Chapter10.hj;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class GumballMachine {
    int count;
    State state;
    StateAction action;

    List<StateAction> statusActions;  //    List<StateAction> statusActions;

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

    public StateAction getAction() {
        return statusActions.stream()
                .filter(status -> status.accept(state))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("알수 없는 Status 입니다."));
    }

    GumballMachine(int count) {
        statusActions = loadStatusActions();
        this.count = count;
        if(count > 0) {setStatus(State.NO_QUARTER);} else {setStatus(State.SOLD_OUT);}
    }

    public void setStatus(State state) {
        this.state = state;
        action = getAction();
    }


    public void insertQuarter() {
        action.insertQuarter(this);
    }


    public void ejectQuarter(){
        action.ejectQuarter(this);
    }


    public void turnCrank(){
        if(action.turnCrank(this)){
            action.dispense(this);
        }
    }

    public void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if(count > 0) {
            count--;
        }
    }

    private List<StateAction> loadStatusActions() {
        List<StateAction> actions = new ArrayList<>();

        // interface impl class loader
        ServiceLoader<StateAction> loader = ServiceLoader.load(StateAction.class);
        for (StateAction action : loader) {
            actions.add(action);
        }

        return actions;
    }


}
