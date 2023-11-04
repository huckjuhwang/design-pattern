package Chapter3.hj.menu;

import Chapter3.hj.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "다크 로스트";
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public Double cost() {
        return 1.5;
    }
}
