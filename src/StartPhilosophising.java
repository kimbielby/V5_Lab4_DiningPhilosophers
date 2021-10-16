import java.util.concurrent.Semaphore;

public class StartPhilosophising {

    public static Semaphore chop1;
    public static Semaphore chop2;
    public static Semaphore chop3;

    public StartPhilosophising(){
        chop1 = new Semaphore(1);
        chop2 = new Semaphore(1);
        chop3 = new Semaphore(1);

        PhilActions philActions = new PhilActions();
        PersonA persAThread = new PersonA(philActions,chop1,chop3);
        PersonB persBThread = new PersonB(philActions,chop2,chop1);
        PersonC persCThread = new PersonC(philActions,chop3,chop2);

        persAThread.start();
        persBThread.start();
        persCThread.start();
    }

    static public void main(String[] args){
        StartPhilosophising startPhilInst = new StartPhilosophising();
    }
}
