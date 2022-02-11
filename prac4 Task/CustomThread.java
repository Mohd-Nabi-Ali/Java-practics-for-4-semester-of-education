package prac4;
public class CustomThread implements Runnable {
    int number;
    public CustomThread(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        try {
            System.out.println("Номер "+number);
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
}
