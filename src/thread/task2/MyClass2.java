package thread.task2;

public class MyClass2 extends Thread{

    public void add(){
        for (int i = 0; i < 10; i++) {
            synchronized (this){
                System.out.println(Thread.currentThread());
                System.out.println("Salam" + i);
            }
        }
    }
    public static void main(String[] args) {
        Thread t = new MyClass2();
        t.start();

    }

    @Override
    public void run() {
        add();
    }
}
