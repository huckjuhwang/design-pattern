package Chapter4.hj.Factory.FactoryMethodPattern.exam;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else {
			return null;
		}
	}
}