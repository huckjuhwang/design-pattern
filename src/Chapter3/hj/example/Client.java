package Chapter3.hj.example;

import Chapter3.hj.example.decorator.Milk;
import Chapter3.hj.example.decorator.Mocha;
import Chapter3.hj.example.menu.DarkRoast;
import Chapter3.hj.example.menu.HouseBlend;

public class Client {
    public static void main(String[] args) throws Exception {
        // venti size up을 통한 0.2원 추가 작업
        Beverage mainMenu = new DarkRoast(); // 1.5
        mainMenu.setSize(Beverage.Size.VENTI); // 0.2
        mainMenu = new Milk(mainMenu);  // 0.3
        mainMenu = new Mocha(mainMenu); // 0.5
        mainMenu = new Mocha(mainMenu); // 0.5
        menuOrderPrint(mainMenu);


        // houseBlend는 벤티사이즈를 제공해주지 않는다.
        Beverage mainMenu2 = new HouseBlend();
        mainMenu2.setSize(Beverage.Size.VENTI);
        mainMenu2 = new Milk(mainMenu2);
        menuOrderPrint(mainMenu2);


        // 사이즈를 선택하지 않으면 기본사이즈인 tall 사이즈를 선택한다.
        Beverage mainMenu3 = new HouseBlend(); // 1.1
        menuOrderPrint(mainMenu3);
    }

    private static void menuOrderPrint(Beverage mainMenu) {
        try {
            System.out.println(mainMenu.getDescription() + ", $" + mainMenu.cost());
        } catch (Exception e) {
            System.out.println("주문 오류 : " + e.getMessage());
        }
    }
}
