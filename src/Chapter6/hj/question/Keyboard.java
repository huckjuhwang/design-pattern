package Chapter6.hj.question;


public class Keyboard {
    public void setCommend(Macro KeyboardMacro, Commend commend) {
        KeyboardMacro.commend = commend;
    }

    public void click(Macro KeyboardMacro) {
        KeyboardMacro.commend.execute();
    }

    public enum Macro {
        CONTROL_C(new NoneCommend(),"복사 하기"),
        CONTROL_V(new NoneCommend(), "붙여 넣기"),
        CONTROL_X(new NoneCommend(), "잘라 넣기");

        Macro(Commend commend, String description){
            this.commend = commend;
            this.description = description;
        }

        private String description;
        private Commend commend;
    }
}
