package Chapter6.hj.basic;

public interface Commend {

    /**
     * receiver의 action메서드를 호출한다.
     */
    public void execute();

    /**
     * 이전 상태로 돌아가는 액션을 취한다.
     */
    public void undo();
}
