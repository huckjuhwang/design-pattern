package Chapter3.hj.starbuzz.decorator;

import Chapter3.hj.starbuzz.Beverage;

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
