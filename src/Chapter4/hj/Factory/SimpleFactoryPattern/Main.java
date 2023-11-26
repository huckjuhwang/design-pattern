package Chapter4.hj.Factory.SimpleFactoryPattern;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

		System.out.println("<CheesePizza>");
		Pizza cheesePizza = pizzaStore.orderPizza("cheese");

		System.out.println("<PepperoniPizza>");
		Pizza pepperoniPizza = pizzaStore.orderPizza("pepperoni");
	}

	public void md() throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
	}
}
