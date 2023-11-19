package Chapter3.hj.starbuzz.menu;

import Chapter3.hj.starbuzz.Beverage;

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
