package Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.sideMenu;

public class PizzaSideMenuFactory implements SideMenu {
    @Override
    public void getSideMenu() {
        System.out.println("사이드 메뉴로 감자튀김이 제공됩니다~~!!!");
    }
}
