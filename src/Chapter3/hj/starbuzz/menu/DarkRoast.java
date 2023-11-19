package Chapter3.hj.starbuzz.menu;

import Chapter3.hj.starbuzz.Beverage;

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
