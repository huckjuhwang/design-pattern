package Chapter3.hj;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;

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

    /**
     * Q. 사이즈가 3종류가 생김, 톨, 그란데, 벤티 사이즈의 개념이 도임했다고 했을때,
     * 어떻게 데코레이터 패턴을 수정할수 있는가??
     *
     * 2가지 케이스
     * 메인 메뉴에 따라 사이즈 가격 상승폭이 다른 경우
     * - 각 메뉴 구현체에서 가격에 대한 상승폭을 정의하고, 상위 클래스로 cost값을 보내준다. 계산에 대한 책임은 decorator로..
     * 메인 메뉴와 별개로 사이즈별 상승폭이 같은 경우
     * - CondimentDecorator 클래스에서 enum class 값을 바라보고 cost값을 추가한다.
     * @return
     */
    public abstract Double cost();
}
