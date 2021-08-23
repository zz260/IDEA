package ThreadExample;

/**
 * 多线程的创建
 * 方式一：继承thread
 * 步骤：1、创建继承thread的子类
 * 2、重写run()方法
 * 3、创建thread子类对象
 * 4、通过此对象调用start():启动当前线程，调用此线程的run()方法
 */
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("吃饭ing");
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("睡觉ing");
    }
}

public class TestThread01 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.start();
        // Thread 的匿名子类（第一种的简写）
        new Thread(){
            @Override
            public void run() {
                System.out.println("玩耍ing");
            }
        }.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "、喝水ing");
        }
    }
}
