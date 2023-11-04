package Chapter3.hj.example.menu;

import Chapter3.hj.example.Beverage;

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
