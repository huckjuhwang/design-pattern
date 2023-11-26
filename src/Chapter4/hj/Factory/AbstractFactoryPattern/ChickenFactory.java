package Chapter4.hj.Factory.AbstractFactoryPattern;

import Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.ChickenServiceMenuFactory;
import Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.FoodServiceMenuAbstractFactory;
import Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.source.ChickenSourceFactory;

public class ChickenFactory implements FoodFactory {

    // 순살여부를 지원하는가
    private boolean isBoneless;

    public ChickenFactory() {
        isBoneless = true;
    }

    public ChickenFactory(boolean isBoneless) {
        this.isBoneless = isBoneless;
    }

    public void setIsBoneLess(boolean isBoneless) {
        this.isBoneless = isBoneless;
    }

    public Boolean isSatisfiedBoneLess()  {
        if(isBoneless) {
            System.out.println("순살을 지원합니다.");
        } else {
            System.out.println("순살을 지원하지 않습니다.");
        }

        return isBoneless;
    }


    @Override
    public Food createFood() {
        System.out.println("치킨이 만들어 졌습니다.");

        // 추가@@
        ChickenServiceMenuFactory chickenServiceMenuFactory = new ChickenServiceMenuFactory();
        chickenServiceMenuFactory.createSource().getSource();
        chickenServiceMenuFactory.createCommonSide().getSideMenu();

        return new Chicken();
    }
}
