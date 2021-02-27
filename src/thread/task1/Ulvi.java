package thread.task1;

public class Ulvi extends Thread {

    private int counter;

    public Ulvi(int counter) {
        this.counter = counter;

    }
    public void put() {
        System.out.println(Thread.currentThread() + " start");
        System.out.println(counter);
        System.out.println(Thread.currentThread() + " end");;
        }
    @Override
    public void run() {
        put();
    }
}