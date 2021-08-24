package ThreadExample;

/**
 * @author zfc
 * @create 2021-08-23 16:50
 *
 * 线程通信例子：使用两个线程打印1-10.线程1，线程2 交替打印
 *
 * 涉及到的三个方法：
 * wait() ：线程堵塞
 * notify() ：唤醒一个线程
 * notifyAll() ：唤醒其他所有的线程
 *
 * 1、这三个方法必须使用在同步代码块或者同步方法中。
 * 2、这三个方法的调用者必须是同步代码块或者同步方法中的同步监视器
 *      否则会出现IllegalMonitorStateException异常
 * 3、这三个方法是定义在java.lang.Object类中
 *
 *
 * 面试题 谈谈wait()和sleep()的异同：
 * 答：1、相同点：一旦执行方法，都可以使当前线程处于拥塞状态
 *     2、不同点：1)两个方法声明位置不同：Thread类中声明sleep(),Object类声明wait()
 *               2)调用的要求不同：sleep()可以再任何需要的场景下调用。wait（）必须在同步代码块或同步方法中
 *               3)关于是否释放同步监视器：如果两个方法都使用在同步代码块或同步方法中，sleep()不会释放锁，wait()会释放锁
 */

class Connect implements Runnable{
    private int count=10;
    @Override
    public void run() {
        while (true){
            synchronized (this){
                if(count>0){
                    notify();
                    System.out.println(Thread.currentThread().getName()+"count="+count);
                    count--;
                }else{
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class ConnectTest {
    public static void main(String[] args) {
        Connect connect=new Connect();
        Thread t1=new Thread(connect);
        Thread t2=new Thread(connect);

        t1.setName("线程一");
        t2.setName("线程二");

        t1.start();
        t2.start();
    }
}
