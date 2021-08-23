package Exercise;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zfc
 * @create 2021-08-23 14:31
 */

class Person extends Thread{
    private static int count=0;
    private ReentrantLock lock=new ReentrantLock();
    private int i=0;
    @Override
    public void run() {
        while(true)
        {
            synchronized (Person.class){

                if(i<3){
                    count=count+1000;
                    System.out.println(Thread.currentThread().getName()+" 账户余额为："+count);
                    i++;
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}

public class SaveMoney {
    public static void main(String[] args) {
        Person t1=new Person();
        Person t2=new Person();
        t1.setName("线程一");
        t2.setName("线程二");
        t1.start();
        t2.start();

    }
}
