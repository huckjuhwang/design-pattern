package Chapter6.hj.question;


public class CtrlXCommend implements Commend {

    private TextViewer textViewer;

    public CtrlXCommend(TextViewer textViewer) {
        this.textViewer = textViewer;
    }

    @Override
    public void execute() {
        textViewer.ctrlX();
    }
}