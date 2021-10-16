import java.lang.Object;
import java.util.concurrent.Semaphore;

public class PhilActions {

    // Think: Sleep with print-line
    // Grab right: acquire a semaphore with print-line
    // Grab left: acquire a semaphore with print-line
    // Eat: sleep with print-line
    // Release left: release with print-line
    // Release right: release with print-line

    // String of phrases that will be printed as actions
    String[] printLines = {"Thinking","Eating", "Got left chopstick","Released left chopstick","Got right chopstick", "Released right chopstick"};




    public PhilActions(){

    }

    public void thinkAction(){
        System.out.println(printLines[0]);
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
    }

    public void eatAction(){
        System.out.println(printLines[1]);
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
    }

    public void grabLeft(){
        System.out.println(printLines[2]);
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
    }

    public void grabRight(){
        System.out.println(printLines[4]);
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
    }

    public void releaseLeft(){
        System.out.println(printLines[3]);
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
    }

    public void releaseRight(){
        System.out.println(printLines[5]);
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
    }


}
