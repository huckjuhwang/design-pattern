package Chapter4.hj.Factory.AbstractFactoryPattern;

import Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.ChickenServiceMenuFactory;
import Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.FoodServiceMenuAbstractFactory;
import Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.PizzaServiceMenuFactory;

public class PizzaFactory implements FoodFactory {
    private Long pizzaCutCount;

    public PizzaFactory() {
        pizzaCutCount = 8L;
    }

    public void pizzaCutCount() {
        System.out.println("피자의 잘린 갯수는 =>" + pizzaCutCount + "입니다.");
    }

    @Override
    public Food createFood() {
        System.out.println("피자가 만들어 졌습니다.");

        // 추가@@
        FoodServiceMenuAbstractFactory pizzaServiceMenuFactory = new PizzaServiceMenuFactory();
        pizzaServiceMenuFactory.createSource().getSource();
        pizzaServiceMenuFactory.createCommonSide().getSideMenu();

        return new Pizza();
    }
}
