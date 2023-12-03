package Chapter6.hj.question;

/*
 Q1. 커맨드 패턴으로 간단한 택스트 편집기 프로그램을 구현
   - 텍스트 복사, 텍스트 붙여넣기, 텍스트 잘라내기 기능이 필요
 */
public class Client {

    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard();  // invoker 셋팅

        TextViewer textViewer = new TextViewer();

        // 커맨드 생성
        CtrlCCommend cc = new CtrlCCommend(textViewer);
        CtrlVCommend cv = new CtrlVCommend(textViewer);
        CtrlXCommend cx = new CtrlXCommend(textViewer);
        System.out.println("========================");


        // 커맨드들은 입력했지만, 커맨드들이 셋팅이 안되었음으로 아무런 액션이 되지 않는다.
        keyboard.click(Keyboard.Macro.CONTROL_C);
        keyboard.click(Keyboard.Macro.CONTROL_X);
        keyboard.click(Keyboard.Macro.CONTROL_V);
        System.out.println("========================");


        // 커맨드들을 셋팅해준다.
        System.out.println("커맨드 셋팅..");
        keyboard.setCommend(Keyboard.Macro.CONTROL_C, cc);
        keyboard.setCommend(Keyboard.Macro.CONTROL_X, cx);
        keyboard.setCommend(Keyboard.Macro.CONTROL_V, cv);
        System.out.println("========================");


        // 커맨드 셋팅이 되었음으로 올바른 결과가 나온다.
        keyboard.click(Keyboard.Macro.CONTROL_C);
        keyboard.click(Keyboard.Macro.CONTROL_X);
        keyboard.click(Keyboard.Macro.CONTROL_V);
        System.out.println("========================");
    }
}
