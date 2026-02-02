package MultiCounter;

public class mainApp {
    public static void main(String[] args) {

        counterTask counter1 = new counterTask("Counter-1");
        counterTask counter2 = new counterTask("Counter-2");
        counterTask counter3 = new counterTask("Counter-3");

        counter1.start();
        counter2.start();
        counter3.start();
    }
}
