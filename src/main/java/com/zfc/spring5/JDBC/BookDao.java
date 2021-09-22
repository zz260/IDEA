package com.zfc.spring5.JDBC;

import com.zfc.spring5.Entity.User1;

import java.util.List;

/**
 * @author zfc
 * @create 2021-09-16 20:02
 */

public interface BookDao {
    void add();

    void delete();

    void update();

    int select();

    User1 selectOne(String id);

    List<User1> selectMore(String id);

    /**
     * 其他批量和此相同
     * */
    void insertMult(List<Object[]> user1s);
}
