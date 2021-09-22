package com.zfc.spring5.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zfc
 * @create 2021-09-11 15:52
 */
@Service
public class Teacher {
    @Value("zz")
    private String name;
    @Value("2101")
    private String classname;
    @Resource(name = "school")
    private School school;

    public void add() {
        System.out.println("Teacher{" +
                "name='" + name + '\'' +
                ", classname='" + classname + '\'' +
                ", school=" + school +
                '}');
    }
}
