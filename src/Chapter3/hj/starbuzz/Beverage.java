package Chapter3.hj.starbuzz;

public abstract class Beverage {
    protected String description = "제목 없음";

    public String getDescription() {
        return "메인 메뉴: " + description;
    }

    public abstract Double cost();
}
