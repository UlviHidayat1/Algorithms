package thread.task2;

public class MyClass1 implements Runnable{

    public void add(){
        for (int i = 0; i < 10; i++) {
            synchronized (this){
                System.out.println(Thread.currentThread());
                System.out.println("Salam" + i);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyClass1 m = new MyClass1();
        Thread t = new Thread(m);
        Thread t1 = new Thread(m);
        t.setPriority(9);
        t.start();
        t1.start();
        Thread.sleep(3000);
        System.out.println("Aleykum");
    }
    @Override
    public void run() {
        add();
    }
}