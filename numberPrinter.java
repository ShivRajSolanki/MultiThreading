public class numberPrinter {
    static class NumberThread extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Number Thread: " + i);
                try {
                    Thread.sleep(500); // pause for 500 ms
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    // Thread using Runnable interface
    static class LetterThread implements Runnable {
        public void run() {
            for (char ch = 'A'; ch <= 'E'; ch++) {
                System.out.println("Letter Thread: " + ch);
                try {
                    Thread.sleep(500); // pause for 500 ms
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Main thread started");

        // Create thread objects
        NumberThread t1 = new NumberThread();
        Thread t2 = new Thread(new LetterThread());

        // Start threads
        t1.start();
        t2.start();

        System.out.println("Main thread ended");
    }
}
