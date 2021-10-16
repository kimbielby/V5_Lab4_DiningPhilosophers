import java.util.concurrent.Semaphore;

public class PersonC extends Thread {

    Semaphore chopL; // chop3
    Semaphore chopR; // chop2
    private PhilActions philoActions;

    public PersonC(PhilActions philActions,Semaphore chop3, Semaphore chop2){
        this.chopL = chop3;
        this.chopR = chop2;
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
