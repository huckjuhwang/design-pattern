package Chapter4.hj.Factory.AbstractFactoryPattern.exam;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	void prepare() {
		System.out.println("Prepare");
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		System.out.println(dough + "\n" + sauce);
	}
}
