package com.zfc.spring5.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author zfc
 * @create 2021-09-11 15:53
 */
@Service
public class School {
    @Value("wust")
    private String schoolName;

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                '}';
    }
}
