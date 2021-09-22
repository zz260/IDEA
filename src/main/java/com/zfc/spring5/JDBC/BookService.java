package com.zfc.spring5.JDBC;

import com.zfc.spring5.Entity.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zfc
 * @create 2021-09-16 20:02
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void addBook() {
        bookDao.add();
    }

    public void deleteBook() {
        bookDao.delete();
    }

    public void updateBook() {
        bookDao.update();
    }

    public void selectBook() {
        System.out.println(bookDao.select());
    }

    public User1 selectone(String id) {
        return bookDao.selectOne(id);
    }

    public List<User1> selectmutl(String id) {
        return bookDao.selectMore(id);
    }

    public void insertMult(List<Object[]> user1s){
        bookDao.insertMult(user1s);
    }
}
