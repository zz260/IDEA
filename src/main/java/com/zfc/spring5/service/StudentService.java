package com.zfc.spring5.service;

import org.springframework.stereotype.Component;

/**
 * @author zfc
 * @create 2021-08-31 17:13
 */
//注解中的value可以不写，此时默认为类名，其首字母小写
@Component(value = "studentService")
public class StudentService {
    public void add(){
        System.out.println("service add ....");
    }
}
