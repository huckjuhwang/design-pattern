package Chapter4.hj.Factory.AbstractFactoryPattern;


/**
 *
 * factory method pattern :
 * - 객체 생성에 대한 책임을 서브클래스로 넘겨서, 서브클래스에서 형태가 정해지는 패턴
 * - 객체기준으로 보는거고, 자신이 사용할 추상 클래스만 알면된다.
 * - 클라이언트와 구상형식을 분리하는 역할
 *
 * abstract factory method pattern:
 * - 선택된 클래스에 맞는 데이터를 가지고 오는 패턴
 * - 클래스 기준으로 보는거고,
 * - 제품군을 만드는 추상형식을 제공한다.
 * - 즉, 제품에 따른 다른 데이터를 가지고 와야할때 사용한다.
 * - 치킨에 대한 서비스 물품들과, 피자에 대한 서비스 물품을 받아오고 싶을때 사용한다.
 *
 * - 각각(치킨, 피자의) 추상 인터페이스를 구현하고, 서비스 물품에 해당하는 제품(소스, 사이드메뉴)의 구현도 필요하다.
 * - 이후 각 추상 팩토리에서, 구현체에 맞는 제품을 리턴해주는 방식
 *
 * - 아무래도 구현체에 의존을 하게될수 있을것 같음.
 */
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
