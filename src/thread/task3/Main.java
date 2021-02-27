package thread.task3;

public class Main implements Runnable{
    public void add() throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            Thread.sleep(3000);
            System.out.println("Hello World");
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        Thread t = new Thread(m);
        t.start();
    }
    @Override
    public void run() {
        try {
            add();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
