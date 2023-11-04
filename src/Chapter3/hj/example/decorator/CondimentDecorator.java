package Chapter3.hj.example.decorator;

import Chapter3.hj.example.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    protected double decoratorCost;

    protected String title;

    @Override
    public Double cost() {
        return beverage.cost() + decoratorCost;
    }

    @Override
    public String getDescription() throws Exception {
        return beverage.getDescription() + ", " + title;
    }
}
