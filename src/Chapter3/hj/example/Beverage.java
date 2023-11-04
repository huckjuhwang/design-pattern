package Chapter3.hj.example;


/**
 * Q. 사이즈가 3종류가 생김, 톨, 그란데, 벤티 사이즈의 개념이 도입했다고 했을때,
 * 어떻게 데코레이터 패턴을 수정할수 있는가??(기본 사이즈는 톨사이즈)
 *
 * 2가지 케이스가 있을것으로 예상
 * 메인 메뉴에 따라 사이즈 가격 상승폭이 다른 경우(* 주로 이경우로 책정이 될것 이라서 요 케이스로 구현)
 * 메인 메뉴와 별개로 사이즈별 상승폭이 같은 경우
 *
 *
 * 위 경우는 하위 메뉴의 구현클래스에서 가격 책정이 이루어져야한다.
 *
 * @return
 */
public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI };
    protected Size size = Size.TALL;

    protected String description = "제목 없음";

    public String getDescription() {
        return "메인 메뉴: " + description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract Double cost();
}
