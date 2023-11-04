package Chapter3.hj.example;

import Chapter3.hj.example.decorator.Milk;
import Chapter3.hj.example.decorator.Mocha;
import Chapter3.hj.example.menu.DarkRoast;

public class Client {
    public static void main(String[] args) {
        Beverage mainMenu = new DarkRoast();
        System.out.println(mainMenu.getDescription() + ", $" + mainMenu.cost());

        Beverage mainMenu2 = new DarkRoast(); // 1.5
        mainMenu2 = new Milk(mainMenu2);  // 0.3
        mainMenu2 = new Mocha(mainMenu2); // 0.5
        mainMenu2 = new Mocha(mainMenu2); // 0.5

        System.out.println(mainMenu2.getDescription() + ", $" + mainMenu2.cost());
    }
}
