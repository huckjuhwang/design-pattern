package Chapter6.hj.question;

public class CtrlCCommend implements Commend {
    private TextViewer textViewer;

    public CtrlCCommend(TextViewer textViewer) {
        this.textViewer = textViewer;
    }

    @Override
    public void execute() {
        textViewer.ctrlC();
    }
}
