package com.zfc.spring5.Work.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author zfc
 * @create 2021-09-17 16:27
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney(Integer money,String name) {
        String sql="update account set money=money+? where name=?";
        int a = jdbcTemplate.update(sql, money, name);
        System.out.println(name+" add "+money);
    }

    @Override
    public void deleteMoney(Integer money,String name) {
        String sql="update account set money=money-? where name=?";
        int a = jdbcTemplate.update(sql, money, name);
        System.out.println(name+" delete "+money);
    }
}
