package thread.task1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
//        ExecutorService executorService2 = Executors.newCachedThreadPool();
        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            counter +=i;
            Ulvi u = new Ulvi(counter);
            executorService.submit(u);
        }
            executorService.shutdown();
            Thread.sleep(2000);
            if (executorService.isTerminated()) {
                System.out.println("Executor Service has been finished");
            }
        }
    }
