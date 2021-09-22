package com.zfc.spring5.service;

/**
 * @author zfc
 * @create 2021-08-27 14:16
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add .....");
        userDao.update();
    }
}
