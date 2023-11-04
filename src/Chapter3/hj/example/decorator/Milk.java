package Chapter3.hj.example.decorator;

import Chapter3.hj.example.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 밀크";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.3;
    }
}
