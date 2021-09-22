package com.zfc.spring5.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author zfc
 * @create 2021-08-27 15:58
 */
@Service(value = "dept1")
public class Dept {
    @Value(value = "安保")
    private String dName;

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdName() {
        return dName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dName='" + dName + '\'' +
                '}';
    }
}
