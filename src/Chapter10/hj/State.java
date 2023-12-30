package Chapter10.hj;

import java.util.List;
import java.util.function.Supplier;

enum State {
    SOLD_OUT(SoldOutState::new),
    NO_QUARTER(NoQuarterState::new),
    HAS_QUARTER(HasQuarterState::new),
    SOLD(SoldState::new);

    private Supplier<StateAction> actions;

    public StateAction getInstance() {
        return actions.get();
    }

    State(Supplier<StateAction> actions) {
        this.actions = actions;
    }
}

