package Chapter3.hj.example.menu;

import Chapter3.hj.example.Beverage;
import Chapter3.hj.example.SizeCostInput;

public class HouseBlend extends Beverage {
    final double menuCost = 1.1;

    public HouseBlend() {
        description = "하우스 블랜드";
        // 하우스 블랜드메뉴는 venti 사이즈를 모두 제공하지 않는다.
        this.size.setCost(new SizeCostInput(0.15, 0.0));
    }


    @Override
    public Double cost() {
        return menuCost + size.getCost();
    }
}
