package com.zfc.spring5.Work.Dao;

/**
 * @author zfc
 * @create 2021-09-17 16:28
 */
public interface UserDao {
    void addMoney(Integer money,String name);
    void deleteMoney(Integer money,String name);
}
