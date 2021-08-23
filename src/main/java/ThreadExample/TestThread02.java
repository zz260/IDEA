package ThreadExample;
/**
 * 创建多线程的方式二：实现runnable接口
 * 1、创建一个实现了runnable的接口类
 * 2、实现类去实现runnable中的抽象方法
 * 3、创建实现类的对象
 * 4、将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5、通过Thread类的对象调用start()
 * */
class Eating implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("吃饭"+Math.addExact(i,1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Drinking implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("喝水"+Math.addExact(i,1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class TestThread02 {
    public static void main(String[] args) {
        Eating eating=new Eating();
        Drinking drinking=new Drinking();
        Thread t1=new Thread(eating);
        Thread t2=new Thread(drinking);
        t1.start();
        t2.start();
    }


}
