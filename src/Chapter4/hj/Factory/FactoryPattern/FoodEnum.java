package Chapter4.hj.Factory.FactoryPattern;


import java.util.function.Supplier;

public enum FoodEnum {
    CHICKEN(Chicken:: new),
    PIZZA(Pizza::new);

    private Supplier<Food> foods;

    public Food getInstance() {
        return foods.get();
    }

    FoodEnum(Supplier<Food> foods) {
        this.foods = foods;
    }
}


