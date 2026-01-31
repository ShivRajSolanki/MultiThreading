class MyTask implements Runnable {

    private String taskName;

    public MyTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Running step " + i 
                + " | Thread: " + Thread.currentThread().getName());

            try {
                Thread.sleep(1000); // 1 second pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class taskRunner{
    public static void main(String[] args) {
         MyTask task1 = new MyTask("Task A");
        MyTask task2 = new MyTask("Task B");
        MyTask task3 = new MyTask("Task C");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.start();
        t2.start();
        t3.start();
    }

}