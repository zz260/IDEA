package ThreadExample;

/**
 * 1、问题：买票中出现重票，错票-->出现了线程的安全问题
 * 2、问题出现的原因：当某个线程操作车票的过程中，尚未完成操作时，其他线程参与进来，也操作车票
 * 3、如何解决：当一个线程a在操作ticket时，其他线程不能参与进来，直至线程a完成对ticket的操作，
 * 其他线程才可以操作ticket。这种情况即使出现阻塞也不能被改变
 * 4、java中使用同步机制解决线程安全问题
 * 方法一：使用同步代码块：
 * synchronized(同步监视器（object对象）){需要被同步的代码块}
 * <p>
 * 说明：1、操作共享数据的代码即为需要同步的代码  --->不能过多更不能过少的包含代码
 * 2、共享数据：多个线程共同操作的变量，比如：ticket就是共享数据
 * 3、同步监视器，俗称：锁 任何一个类的对象都可以充当锁。
 * 也可使用 this 或者当前类充当同步监视器，但是慎用this
 * tips:类也是一个对象
 * 要求：多个线程必须共用一把锁
 * <p>
 * 方法二：同步方法
 * 在需要同步的代码块抽取出来写成synchronized类型的类
 * 1、同步方法依旧用到同步监视器 只是不需要显示声明
 * 2、非静态同步方法，同步监视器是this
 * 静态方法，同步监视器是当前类本身
 * <p>
 * 方法三：使用lock方法    ------jdk5.0新增
 * 在线程中实例化eentrantLock（ReentrantLock l=new ReentrantLock）
 * 然后在同步代码块中使用try{l.lock()}finally{l.unlock()}
 * <p>
 * 5、同步的方式：好处是解决了线程的安全问题
 * 操作同步代码块时只能有一个线程参与，其他等待，相当于一个单线程的过程，效率低   ----局限性
 */
//class Windows01 implements Runnable{
//    private int target=100;
//    Object obj=new Object();
//    @Override
//    public void run() {
//        while (true) {
//            synchronized(this){
//            //synchronized(obj) {
//                if(target>0){
//                    System.out.println(Thread.currentThread().getName() + "出售了第 " + target + " 张票");
//                    target--;
//                }else{
//                    break;
//                }
//
//            }
//        }
//    }
//}


class Windows01 implements Runnable {
    private int target = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            if (target <= 0) {
                break;
            }
            show();
        }
    }


    public synchronized void show() {
        if (target > 0) {
            System.out.println(Thread.currentThread().getName() + "出售了第 " + target + " 张票");
            target--;
        }
    }
}

public class WindowsTest02 {
    public static void main(String[] args) {
        Windows01 windows01 = new Windows01();

        Thread t1 = new Thread(windows01);
        t1.setName("窗口一");
        Thread t2 = new Thread(windows01);
        t2.setName("窗口二");
        Thread t3 = new Thread(windows01);
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
