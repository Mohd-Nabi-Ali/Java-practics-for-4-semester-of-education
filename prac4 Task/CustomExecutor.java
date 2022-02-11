package prac4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class CustomExecutor {
    private int number_thread=0;
    public CustomExecutor(int number_thread) {
        this.number_thread = number_thread;
        ExecutorService executor;
        executor = Executors.newFixedThreadPool(3);
        System.out.println("Запуск потоков");
        for(int i=0;i<number_thread;i++){
            executor.execute(new CustomThread(i+1));
        }
        executor.shutdown();
    }
}
