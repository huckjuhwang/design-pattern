package Chapter3.hj.example.menu;

import Chapter3.hj.example.Beverage;
import Chapter3.hj.example.SizeCostInput;

public class DarkRoast extends Beverage {
    final double menuCost = 1.5;

    public DarkRoast() {
        description = "다크 로스트";
        // 다크로스트 메뉴는 모든 사이즈를 모두 제공한다.
        this.size.setCost(new SizeCostInput(0.15, 0.20));
    }


    @Override
    public Double cost() {
        return menuCost + size.getCost();
    }
}
