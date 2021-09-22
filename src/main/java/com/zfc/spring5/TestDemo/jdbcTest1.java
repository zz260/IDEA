package com.zfc.spring5.TestDemo;

import com.zfc.spring5.JDBC.BookService;
import com.zfc.spring5.Work.Service.UserService;
import com.zfc.spring5.config.txConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zfc
 * @create 2021-09-16 20:28
 */
public class jdbcTest1 {
    @Test
    public void testjdbc() {
        ApplicationContext context = new ClassPathXmlApplicationContext("JDBCbean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        //bookService.addBook();       //增
        //bookService.deleteBook();    //删
        //bookService.updateBook();    //改
        //bookService.selectBook();    //查

        //User1 user1=bookService.selectone("1");
        //System.out.println(user1);

        //List<User1> user1s = bookService.selectmutl("17");
        //System.out.println(user1s);


        List<Object[]> obj=new ArrayList<>();
        Object[] o1={"5","3","5000","甲"};
        Object[] o2={"6","4","6000","乙"};
        Object[] o3={"7","5","7000","丙"};
        obj.add(o1);
        obj.add(o2);
        obj.add(o3);
        bookService.insertMult(obj);
    }

    @Test
    public void TestWork(){
        ApplicationContext context = new ClassPathXmlApplicationContext("JDBCbean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add(100,"zfc");
        //userService.delete(100,"zfc");
    }

    @Test
    public void TestWork02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("JDBCbean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add(100,"zfc");
        //userService.delete(100,"zfc");
    }

    @Test
    public void TestWork3(){
        ApplicationContext context=new AnnotationConfigApplicationContext(txConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add(100,"zfc");
    }
}
