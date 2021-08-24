package Exercise;

/**
 * @author zfc
 * @create 2021-08-24 9:15
 */

class Clerk{
    private int shop;
    public Clerk(int shop){
        this.shop=shop;
    }

    public int getShop() {
        return shop;
    }

    public void setShop(int shop) {
        this.shop = shop;
    }
}

class Product implements Runnable{
    Clerk clerk;
    public Product(Clerk clerk){
        this.clerk=clerk;
    }
    @Override
    public void run() {
        while (true){
            synchronized (Product.class){
                if(clerk.getShop()<20){
                    clerk.setShop(clerk.getShop()+1);
                    System.out.println(Thread.currentThread().getName()+"生产了一件，店员还有："+clerk.getShop());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Product.class.notify();
                }else{
                    try {
                        Product.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
class Costumer implements Runnable{
    Clerk clerk;
    public Costumer(Clerk clerk){
        this.clerk=clerk;
    }
    @Override
    public void run() {
        while(true){
            synchronized (Product.class){
                if(clerk.getShop()>0){
                    clerk.setShop(clerk.getShop()-1);
                    System.out.println(Thread.currentThread().getName()+"消费了一件，店员还有："+clerk.getShop());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Product.class.notify();
                }else{
                    try {
                        Product.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
public class PSCTest {
    public static void main(String[] args) {
        Clerk clerk=new Clerk(20);
        Product product=new Product(clerk);
        Costumer costumer=new Costumer(clerk);
        Thread t1=new Thread(product);
        Thread t2=new Thread(costumer);

        t1.setName("生产者");
        t2.setName("消费者");

        t1.start();
        t2.start();
    }
}
