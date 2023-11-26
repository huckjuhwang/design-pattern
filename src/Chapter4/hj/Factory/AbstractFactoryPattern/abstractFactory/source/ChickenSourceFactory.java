package Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.source;

public class ChickenSourceFactory implements Source {
    @Override
    public void getSource() {
        System.out.println("추가 소스로 => 매운 양념과, 소금이 제공됩니다.");
    }
}
