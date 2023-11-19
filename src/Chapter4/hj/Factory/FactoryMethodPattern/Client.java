package Chapter4.hj.Factory.FactoryMethodPattern;

public class Client {
    /**
     * 팩토리 메서드 패턴의 핵심은, factory interface이다.
     *
     * 해당 생성하는 팩토리 메소드들은 가지고있고, 서브클래스들은 다른 네이밍을 쓰는 경우가 있다. ~~Manager, ~~Creator
     *
     * object creater 하는 메서드가 상속되어있다면, 팩토리 메서드 패턴을 사용했구나 라고 이해하면된다.
     *
     *
     * 이 패턴에서는 하나의 오브젝트가 == 하나의 factory와 매칭이 될 필요는 없다.
     * 오브젝트를 생성하는 메서드가 상속이 되었는가, 즉, 오브젝트를 만들어 내는 클래스가 상속이되어있느냐.. 가 핵심
     *
     * @param args
     */
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

        System.out.println("==================");

        PizzaFactory pizzaFactory = new PizzaFactory();
        Food food = pizzaFactory.createFood();
        food.eat();
        pizzaFactory.pizzaCutCount();
    }
}
