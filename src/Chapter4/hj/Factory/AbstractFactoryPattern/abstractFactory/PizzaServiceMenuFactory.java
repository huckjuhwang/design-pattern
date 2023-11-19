package Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory;


import Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.sideMenu.PizzaSideMenuFactory;
import Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.sideMenu.SideMenu;
import Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.source.PizzaSourceFactory;
import Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.source.Source;

public class PizzaServiceMenuFactory implements FoodServiceMenuAbstractFactory {
    @Override
    public Source createSource() {
        return new PizzaSourceFactory();
    }

    @Override
    public SideMenu createCommonSide() {
        return new PizzaSideMenuFactory();
    }
}
