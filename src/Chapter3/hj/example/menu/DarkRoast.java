package Chapter3.hj.example.menu;

import Chapter3.hj.example.Beverage;
import Chapter3.hj.example.SizeCostInput;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "다크 로스트";
        // 다크로스트 메뉴는 3개의 사이즈를 모두 제공한다.
        this.size.setCost(new SizeCostInput(0.15, 0.20));
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public Double cost() throws Exception {
        double menuCost = 1.5;

        if(!this.size.isSatisfied(this)) {
            throw new Exception("\"" + description + "\" 메뉴의 " + this.size.name() + "사이즈는 제공되지 않습니다.");
        }

        return menuCost + size.getCost();
    }
}
