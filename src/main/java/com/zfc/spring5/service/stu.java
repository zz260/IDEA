package com.zfc.spring5.service;

import com.zfc.spring5.dto.Course;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author zfc
 * @create 2021-08-30 13:56
 */
public class stu {
    private String[] courses;
    private Map<String, String> map;
    private List<String> list;
    private Set<String> set;
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void show() {
        System.out.println("courses " + Arrays.toString(courses));
        System.out.println("list " + list);
        System.out.println("set " + set);
        System.out.println("map " + map);
        System.out.println("courseList"+courseList);
    }
}
