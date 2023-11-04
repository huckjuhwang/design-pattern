package Chapter3.hj.decorator;

import Chapter3.hj.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.5;
    }
}
