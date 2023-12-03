package Chapter6.hj.basic;

public class Invoker {
    Commend commend;

    public void setCommend(Commend commend){
        this.commend  = commend;
    }

    public void buttonClick(){
        commend.execute();
    }
}
