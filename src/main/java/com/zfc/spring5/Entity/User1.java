package com.zfc.spring5.Entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author zfc
 * @create 2021-09-16 20:11
 */
@Repository
public class User1 {

    @Value("2")
    private Integer id;
    @Value("17")
    private String departmentId;

    @Value("70000")
    private String salary;

    @Value("wfj")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", departmentId='" + departmentId + '\'' +
                ", salary='" + salary + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
