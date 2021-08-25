package ThreadExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zfc
 * @create 2021-08-25 10:36
 */

class NumberThread implements Runnable{
    private int i=0;
    @Override
    public void run() {
        while (true){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+"："+i);
            }
            i++;
            if(i>100){
                break;
            }
        }
    }
}

public class TestThread04 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        System.out.println(executorService.getClass());

        executorService.execute(new NumberThread());
        executorService.execute(new NumberThread());

        executorService.shutdown();
    }
}
