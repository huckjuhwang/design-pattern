package Chapter4.hj.Factory.AbstractFactoryPattern;

public class Pizza implements Food {
    @Override
    public void eat() {
        System.out.println("피자 맛있엉");
    }
}
