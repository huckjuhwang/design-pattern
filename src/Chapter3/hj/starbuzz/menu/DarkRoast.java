package Chapter3.hj.starbuzz.menu;

import Chapter3.hj.starbuzz.Beverage;

public class DarkRoast extends Beverage {

    private DarkRoast() {
        description = "다크 로스트";
    }

    private static class SingleInstanceHolder {
        private static final DarkRoast INSTANCE = new DarkRoast();
    }

    public static DarkRoast getInstance() {
        return SingleInstanceHolder.INSTANCE;
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
