package ThreadExample;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zfc
 * @create 2021-08-23 11:18
 *
 * 1、简述synchronized和Lock的异同
 * 同：都能够解决线程同步问题
 * 异：1、synchronized 机制在执行完同步代码块后自动释放了同步监视器
 *    Lock  机制需要手动的启动同步（lock）以及手动的终止同步（unlock）
 *    (Lock是显示锁（手动开关锁），synchronized是隐式锁，出了作用域自动释放)
 *    2、Lock 是代码块锁，synchronized有代码块锁和方法锁
 *    3、使用Lock锁，jvm将花费较少的时间来调度线程，性能更好。并且具有更好的扩展性（提供更多的子类）
 *
 *  2、优先使用顺序
 *  Lock --> 同步代码块（已经进入方法体，分配了相应资源） --> 同步方法（在方法体之外）
 */

class Windows03 implements Runnable{
    private int target=100;
    private ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            try{
                lock.lock();
                if(target>0){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "出售了第 " + target + " 张票");
                    target--;
                }else{
                    break;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}

public class WindowsTest03 {
    public static void main(String[] args) {
        Windows03 windows01=new Windows03();

        Thread t1=new Thread(windows01);
        t1.setName("窗口一");
        Thread t2=new Thread(windows01);
        t2.setName("窗口二");
        Thread t3=new Thread(windows01);
        t3.setName("窗口三");

        Thread t4=new Thread(windows01);
        t4.setName("窗口四");

        Thread t5=new Thread(windows01);
        t5.setName("窗口五");

        Thread t6=new Thread(windows01);
        t6.setName("窗口六");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
