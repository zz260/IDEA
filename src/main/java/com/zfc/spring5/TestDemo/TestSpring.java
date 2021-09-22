package com.zfc.spring5.TestDemo;

import com.zfc.spring5.Book;
import com.zfc.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author zfc
 * @create 2021-08-26 14:13
 */

/**
 * Spring 提供IOC容器实现的两种方式：
 * (1)BeanFactory ioc容器基本实现，是spring内部的使用接口，不提供开发人员使用
 *        加载配置文件时不会创建对象，在获取对象中创建对象（用时创建）
 * (2)ApplicationConttext BeanFactory接口的子接口，提供更多更强大的功能，一般由开发人员进行使用
 *        加载配置文件中就会创建对象(加载中创建)
 *
 *   ClassPathXmlApplicationContext指src下的目录
 *   FileSystemXmlApplicationContext指文件在系统盘中的位置
 *
 *
 *   注入方式：
 *   1、使用property进行set注入
 *   2、使用constructor-arg进行有参构造注入
 *   3、在 <property name="name"><null></null></property>即可给name赋空值
 * */
public class TestSpring {
    @Test
    public void testAdd(){
        //加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        //引用类
        Book book=context.getBean("book", Book.class);
        User user=context.getBean("user2",User.class);
        //调用
        user.user1();
        book.book();
    }
}
