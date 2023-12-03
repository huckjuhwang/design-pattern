package Chapter6.hj.question;

public class NoneCommend implements Commend {
    @Override
    public void execute() {
        System.out.println("매크로가 지정되지 않았습니다.");
    }
}
