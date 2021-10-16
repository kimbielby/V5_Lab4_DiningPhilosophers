import java.util.concurrent.Semaphore;

public class PersonA extends Thread {

    Semaphore chopL; // chop1
    Semaphore chopR; // chop3
    private PhilActions philoActions;

    public PersonA(PhilActions philActions, Semaphore chop1, Semaphore chop3){
        this.chopL = chop1;
        this.chopR = chop3;
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
