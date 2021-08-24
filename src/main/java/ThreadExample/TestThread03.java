package ThreadExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author zfc
 * @create 2021-08-24 15:17
 */


/**
 * 创建线程的方式三：实现Callable接口。   --- JDK 5.0新增
 *
 * 1、创建一个Callable实现类
 * 2、实现call方法，将此线程需要执行的操作声明在call()中
 * 3、创建Callable接口实现类的对象
 * 4、将此Callable接口实现类传递到FutureTask构造器中，创建FutureTask的对象
 * 5、将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()方法
 * 6、获取Callable中call方法的返回值
 *
 *
 * 如何理解实现Callable创建线程的方式比实现Runnable类来创建线程的方式强大？
 * 答：1、call()可以抛出异常，被外部的操作捕获，获取异常的信息
 *    2、call()可以有返回值
 *    3、Callable支持泛型
 * */
class numThread implements Callable {
    private int count = 0;
    @Override
    public Object call() throws Exception {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
                count+=i;
            }
        }
        return count;
    }
}

public class TestThread03 {
    public static void main(String[] args) {
        numThread numThread=new numThread();
        FutureTask futureTask=new FutureTask(numThread);
        new Thread(futureTask).start();
        try {
            Object sum=futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
