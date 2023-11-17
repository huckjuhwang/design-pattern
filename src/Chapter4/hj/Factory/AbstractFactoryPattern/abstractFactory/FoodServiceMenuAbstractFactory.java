package Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory;

import Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.sideMenu.SideMenu;
import Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.source.Source;

public interface FoodServiceMenuAbstractFactory {

    /**
     * 음식에 따른 소스 제공
     */
    public Source createSource();

    /**
     * 음식에 따른 사이드 메뉴 제공한다.
     */
    public SideMenu createCommonSide();


}
