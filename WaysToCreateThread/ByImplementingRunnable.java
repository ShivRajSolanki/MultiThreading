package WaysToCreateThread;
 class CookingTask implements Runnable{
    private String task;

    CookingTask(String task) {
        this.task = task;
    }
    public void run() {
        System.out.println(task + " is being prepared by " +
            Thread.currentThread().getName());
    }
}


public class ByImplementingRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new CookingTask("Pasta"));
        Thread t2 =new Thread( new CookingTask("DalBati"));
        Thread t3 = new Thread(new CookingTask("PaneerTikka"));

        t1.start();
        t2.start();
        t3.start();
    }
}
