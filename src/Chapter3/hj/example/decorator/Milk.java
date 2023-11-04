package Chapter3.hj.example.decorator;

import Chapter3.hj.example.Beverage;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
        decoratorCost = 0.3;
        title = "밀크";
    }
}
