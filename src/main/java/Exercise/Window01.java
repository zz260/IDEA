package Exercise;

import java.util.concurrent.locks.ReentrantLock;

class SaleWindow implements Runnable{
    private int ticket=100;

    private ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            try{
                lock.lock();
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"出售了No:"+ticket);
                    ticket--;
                }else {
                    break;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}

public class Window01 {
    public static void main(String[] args) {
        SaleWindow saleWindow=new SaleWindow();
        Thread t1=new Thread(saleWindow);
        Thread t2=new Thread(saleWindow);
        Thread t3=new Thread(saleWindow);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }


}
