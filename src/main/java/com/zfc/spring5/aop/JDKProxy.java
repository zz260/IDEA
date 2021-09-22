package com.zfc.spring5.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zfc
 * @create 2021-09-16 9:34
 */
public class JDKProxy {

    static class UserDaoProxy implements InvocationHandler{
        private Object obj;

        public UserDaoProxy(Object obj) {
            this.obj = obj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            System.out.println("方法执行前。。。。");

            Object res=method.invoke(obj,args);

            System.out.println("方法执行后。。。。");

            return res;
        }
    }

    public static void main(String[] args) {
        Class[] interfaces={UserDao.class};

        UserDaoImpl userDao=new UserDaoImpl();
        UserDao dao=(UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader()
                ,interfaces, new UserDaoProxy(userDao));
        int s=dao.add(1,2);
        System.out.println("s="+s);

    }

}
