package Chapter4.hj.Factory.AbstractFactoryPattern;

public class Chicken implements Food {
    @Override
    public void eat() {
        System.out.println("치킨 맛있엉!");
    }
}
