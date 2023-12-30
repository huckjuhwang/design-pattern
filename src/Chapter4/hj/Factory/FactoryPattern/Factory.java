package Chapter4.hj.Factory.FactoryPattern;

public class Factory {
    public Food createFood(FoodEnum food) {
        return food.getInstance();
    }
}