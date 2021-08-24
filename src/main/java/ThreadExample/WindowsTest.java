package ThreadExample;


class Windows extends Thread {
    static int ticket = 50;

    @Override
    public void run() {
        while (ticket > 0) {
            ticket--;
            System.out.println(getName() + "出售了" + ticket + "号的票");
        }
    }
}

public class WindowsTest {
    public static void main(String[] args) {
        Windows t1 = new Windows();
        Windows t2 = new Windows();
        Windows t3 = new Windows();

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
