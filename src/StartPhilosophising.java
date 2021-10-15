import java.util.concurrent.Semaphore;

public class StartPhilosophising {

    public static Semaphore chop1;
    public static Semaphore chop2;
    public static Semaphore chop3;

    public StartPhilosophising(){
        chop1 = new Semaphore(1);
        chop2 = new Semaphore(1);
        chop3 = new Semaphore(1);
    }
}
