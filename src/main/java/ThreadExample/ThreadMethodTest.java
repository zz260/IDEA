package ThreadExample;

/**
 * 测试thread类中的常用方法
 * 1、start() 启动线程并调用run方法
 * 2、run() 通常需要重写此方法，将此线程需要的事情写入此方法
 * 3、currentThread() 静态方法，返回当前
 * 4、getName() 获取当前线程名字
 * 5、setName() 设置当前线程名字
 * 6、yield() 释放当前cpu执行权
 * 7、join() 在线程a中调用线程b的join()，此时线程啊就进入阻塞状态，直到线程b完全执行以后，线程a才结束阻塞状态
 * 8、stop() ：已经过时了。当调用此方法就强制结束当前线程
 * 9、sleep(long millitime)  让当前线程阻塞指定毫秒时间，需要使用try**catch**
 * 10、isAlive 判断当前线程是否结束
 */

class thread1 extends Thread {

    @Override

    public void run() {
        System.out.println("吃饭ing");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("吃完了");
    }
}

class thread2 extends Thread {
    @Override
    public void run() {
        System.out.println("喝水ing");
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("不渴了");
    }
}

public class ThreadMethodTest {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}
