package Chapter4.hj.Factory.AbstractFactoryPattern.abstractFactory.sideMenu;

public class ChickenSideMenuFactory implements SideMenu {
    @Override
    public void getSideMenu() {
        System.out.println("사이드 메뉴로 치킨무가 제공됩니다~~!!!");
    }
}
