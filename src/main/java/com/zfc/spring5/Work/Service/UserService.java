package com.zfc.spring5.Work.Service;

import com.zfc.spring5.Work.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zfc
 * @create 2021-09-17 16:27
 */
@Service
//@Transactional(isolation = Isolation.REPEATABLE_READ)
/**
 * 可以添加到类上：类中所有方法添加事务
 * 添加到方法上：只有该方法添加事务
 * */
public class UserService {

    @Autowired
    private UserDao userDao;

    public void add(Integer money,String name){
        userDao.addMoney(money,name);
//        int a=100/0;
        userDao.deleteMoney(100,"ht");
    }

    public void delete(Integer money,String name){
        userDao.deleteMoney(money,name);
    }
}
