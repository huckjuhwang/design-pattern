package Chapter4.hj.Factory.FactoryPattern;

public class Client {
    /**
     *
     * 팩토리 => 공장(class or function)
     * - 오브젝트를 찍어 낼수 있는 공장
     *
     * 피자, 치킨
     *
     * food(상위 클래스) -> chikine, pizza
     *
     *
     * 복잡한 object생성과정을 클라이언트가 직접 다룰 필요가 없다.
     * 위 예제에서는 간단하기 떄문에 공감이 안될수도 있지만
     *
     * 책에서는 피자를 만드는 과정을 대비해서 설명해보면
     *
     * 피자를 만들기 위해서는 총4가지의 과정이 필요했다.
     * - 준비
     * - 굽기
     * - 자르기
     * - 포장하기
     *
     * 클라이언트 입장에서는 객체를 생성하기위한 위와 같은 과정을 몰라도 쉽게 생성할수 있도록 하는게 팩토리 패턴의 핵심이다.
     *
     * 한계
     * - 피자가 잘라지는 갯수를 원할수도 있고,
     * - 순살로만 포장이 되도록 원할수도 있다.
     *
     * 이런 경우에는 추가구현을 하는건 어려움이 있다. 하나의 팩토리에 필요없는 코드가 많이 생기기때문.
     *
     * 이러한 문제를 팩토리 메서드 패턴에서 해결할수 있다.
     *  -- 팩토리 패턴의 생성 메서드를 Interface화 시킨다
     * 각각의 factory를 생성한다. (피자, 치킨)
     * - 이를 위한 interface를 정의하고, CreateFood라는 팩토리 메서드를 제공한다.
     *
     * 이를 통해 피자를 몇조각으로 짜르는지, 치킨은 순살이 가능한지 여부를 받을수 있게된다.
     * @param args
     */
    public static void main(String[] args) {
        Factory factory = new Factory();
        Food chicken = factory.createFood(FoodEnum.CHICKEN);
        chicken.eat();

        Food pizza = factory.createFood(FoodEnum.PIZZA);
        pizza.eat();
    }
}
