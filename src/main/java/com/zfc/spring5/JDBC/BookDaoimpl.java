package com.zfc.spring5.JDBC;

import com.zfc.spring5.Entity.User1;
import com.zfc.spring5.aopAnno.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zfc
 * @create 2021-09-16 20:03
 */
@Repository
public class BookDaoimpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private User1 user1;

    @Override
    public void add(){
        String sql="insert into emploryee values(?,?,?,?)";
        int add=jdbcTemplate.update(sql, user1.getId(), user1.getDepartmentId(), user1.getSalary(), user1.getName());
        System.out.println(add);
    }

    @Override
    public void delete(){
        String sql="delete from emploryee where id=?";
        int delete=jdbcTemplate.update(sql, user1.getId());
        System.out.println(delete);
    }

    @Override
    public void update(){
        String sql="update emploryee set DepartmentId=?,Salary=?,Name=? where id=?";
        int update=jdbcTemplate.update(sql,  user1.getDepartmentId(), user1.getSalary(), user1.getName(),user1.getId());
        System.out.println(update);
    }

    @Override
    public int select(){
        String sql="select count(*) from emploryee";
        int count=jdbcTemplate.queryForObject(sql,Integer.class);
        System.out.println(count);
        return count;
    }

    @Override
    public User1 selectOne(String id){
        String sql="select * from emploryee where id=?";
        User1 user1=jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User1>(User1.class),id);
        return user1;
    }

    @Override
    public List<User1> selectMore(String id){
        String sql="select * from emploryee where DepartmentId=?";
        List<User1> user1s=jdbcTemplate.query(sql,new BeanPropertyRowMapper<User1>(User1.class),id);
        return user1s;
    }

    @Override
    public void insertMult(List<Object[]> user1s) {
        String sql="insert into emploryee values(?,?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, user1s);
        System.out.println(Arrays.toString(ints));
    }
}
