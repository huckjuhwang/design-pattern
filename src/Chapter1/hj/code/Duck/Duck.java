package Chapter1.hj.code.Duck;

public class Duck {
    private QuackBehavior quackBehavior;

    public void setQuickBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * 오리(Duck)를 울게 할수 있는 메서드
     */
    public void cry() {
        quackBehavior.cry();
    }

}