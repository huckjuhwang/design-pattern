package Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.source;

public class PizzaSourceFactory implements Source {
    @Override
    public void getSource() {
        System.out.println("추가 소스로 => 핫소스가 제공됩니다.");
    }
}
