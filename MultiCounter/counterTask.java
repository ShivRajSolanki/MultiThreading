package MultiCounter;

public class counterTask extends Thread {
    private String counterName;

    counterTask(String counterName) {
        this.counterName = counterName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(counterName + " : " + i);
            try {
                Thread.sleep(500); // pause for half second
            } catch (InterruptedException e) {
                System.out.println("Counter interrupted");
            }
        }
    }
}
