package Chapter3.hj.example;

public class SizeCostInput {
    // tall size는 기본으로 제공되는 사이즈 이므로 추가 가격이 붙지 않는다
    public double tallCost = 0.0;
    public double grandCost;
    public double ventiCost;


    public SizeCostInput(){

    }

    public SizeCostInput(double grandCost, double ventiCost) {
        this.grandCost = grandCost;
        this.ventiCost = ventiCost;
    }
}
