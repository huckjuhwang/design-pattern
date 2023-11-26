package Chapter3.hj.starbuzz;

import Chapter3.hj.starbuzz.decorator.Milk;
import Chapter3.hj.starbuzz.decorator.Mocha;
import Chapter3.hj.starbuzz.menu.DarkRoast;

public class Client {
    public static void main(String[] args) {
        Beverage mainMenu = DarkRoast.getInstance();
        System.out.println(mainMenu.getDescription() + ", $" + mainMenu.cost());

        Beverage mainMenu2 = DarkRoast.getInstance();; // 1.5
        mainMenu2 = new Milk(mainMenu2);  // 0.3
        mainMenu2 = new Mocha(mainMenu2); // 0.5
        mainMenu2 = new Mocha(mainMenu2); // 0.5

        System.out.println(mainMenu2.getDescription() + ", $" + mainMenu2.cost());
    }
}
