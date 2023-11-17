package Chapter4.hj.Factory.AbstractFactoryPattern;

public class Client {
    public static void main(String[] args) {
        ChickenFactory chickenFactory = new ChickenFactory();

        /**
         * 순살 가능여부 체크
         */
        Boolean satisfiedBoneLess = chickenFactory.isSatisfiedBoneLess();
        if(satisfiedBoneLess) {
            Food food = chickenFactory.createFood();
            food.eat();
        }

        System.out.println("============");


        PizzaFactory pizzaFactory = new PizzaFactory();
        Food food = pizzaFactory.createFood();
        food.eat();
        pizzaFactory.pizzaCutCount();
    }
}
