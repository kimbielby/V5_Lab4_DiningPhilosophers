import java.util.concurrent.Semaphore;

public class PersonB extends Thread {

    Semaphore chopL; // chop2
    Semaphore chopR; // chop1
    private PhilActions philoActions;

    public PersonB(PhilActions philActions,Semaphore chop2, Semaphore chop1){
        this.chopL = chop2;
        this.chopR = chop1;
        this.philoActions = philActions;
    }

    public void run(){
        try {
            philoActions.thinkAction();
            chopR.acquire();
            philoActions.grabRight();
            chopL.acquire();
            philoActions.grabLeft();
            philoActions.eatAction();
            chopL.release();
            philoActions.releaseLeft();
            chopR.release();
            philoActions.releaseRight();
            philoActions.thinkAction();
        }
        catch(Exception e){}
    }
}
