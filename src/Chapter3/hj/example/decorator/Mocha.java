package Chapter3.hj.example.decorator;

import Chapter3.hj.example.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        decoratorCost = 0.5;
        title = "모카";
    }
}
