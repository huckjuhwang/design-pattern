package Chapter4.hj.Factory.FactoryPattern;

public class Factory {

    // 현업에서는 enum으로 정의해야함(type-safety)
    public Food createFood(String foodName) {
        if(foodName.equals("CHICKEN")) {
            return new Chicken();
        } else if(foodName.equals("PIZZA")){
            return new Pizza();
        }
        return null;
    }
}
