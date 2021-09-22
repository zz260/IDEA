package com.zfc.spring5.aop;

/**
 * @author zfc
 * @create 2021-09-15 21:29
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a,int b){
        System.out.println("调用此方法");
        return a+b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
