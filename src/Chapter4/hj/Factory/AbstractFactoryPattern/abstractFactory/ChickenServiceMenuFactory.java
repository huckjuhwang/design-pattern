package Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory;

import Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.sideMenu.ChickenSideMenuFactory;
import Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.sideMenu.SideMenu;
import Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.source.ChickenSourceFactory;
import Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.source.Source;

public class ChickenServiceMenuFactory implements FoodServiceMenuAbstractFactory {
    @Override
    public Source createSource() {
        return new ChickenSourceFactory();
    }

    @Override
    public SideMenu createCommonSide() {
        return new ChickenSideMenuFactory();
    }
}
