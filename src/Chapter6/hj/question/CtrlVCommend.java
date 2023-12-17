package Chapter6.hj.question;


public class CtrlVCommend implements Commend {
    private TextViewer textViewer;

    public CtrlVCommend(TextViewer textViewer) {
        this.textViewer = textViewer;
    }

    @Override
    public void execute() {
        textViewer.ctrlV();
    }
}
