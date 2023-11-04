package Chapter3.hj.menu;

import Chapter3.hj.Beverage;

public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return super.getDescription() + "하우스 블랜드";
    }

    @Override
    public Double cost() {
        return 1.1;
    }
}
