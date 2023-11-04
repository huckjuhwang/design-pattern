package Chapter3.hj.example;


/**
 * // 문제
 * Q. 사이즈가 3종류가 생김, 톨, 그란데, 벤티 사이즈의 개념이 도입했다고 했을때,
 * 어떻게 데코레이터 패턴을 수정할수 있는가??(기본 사이즈는 톨사이즈)
 *
 *
 * // 문제 정의
 * 2가지 케이스가 있을것으로 예상
 * 메인 메뉴에 따라 사이즈 가격 상승폭이 다른 경우(* 주로 이경우로 책정이 될것 이라서 요 케이스로 구현)
 * 메인 메뉴와 별개로 사이즈별 상승폭이 같은 경우
 *
 *
 * // 예외 케이스
 * - 메뉴마다 사이즈 지원이 되지 않는 케이스가 있을 수 있다.
 * - 메뉴마다 가격이 다르기 때문에 구현체에서 가격 가격 책정이 이루어져야한다.
 *
 * @return
 */
public abstract class Beverage {
    public enum Size {
        TALL(0.0),
        GRANDE(0.0),
        VENTI(0.0);

        private double cost;

        public Double getCost() {
            return cost;
        }

        /**
         * 사이즈에 따른 cost값을 설정해준다.
         */
        public void setCost(SizeCostInput sizeCost) {
            this.TALL.cost = sizeCost.tallCost;
            this.GRANDE.cost = sizeCost.grandCost;
            this.VENTI.cost = sizeCost.ventiCost;
        }

        /**
         * cost값이 정의되어 있지 않다면 지원하지 않는 사이즈이다.
         * - 단, tall사이즈는 기본으로 정의되는 사이즈이기 때문에 제외한다.
         */
        public boolean isSatisfied(Beverage beverage) {
            if(beverage.size.cost == 0.0 && beverage.size != Size.TALL) {
                return false;
            } else {
                return true;
            }
        }

        Size(Double cost){
            this.cost = cost;
        }
        };
    protected Size size = Size.TALL;

    public void setSize(Size size) {
        this.size = size;
    }

    protected String description = "제목 없음";

    public String getDescription() throws Exception {
        if(!this.size.isSatisfied(this)) {
            throw new Exception(description + "메뉴의 " + this.size.name() + "사이즈는 제공되지 않습니다.");
        }

        return "메인 메뉴: (" + description + ")";
    }


    public abstract Double cost();
}
