package com.zfc.spring5.service;

import com.zfc.spring5.dto.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author zfc
 * @create 2021-08-30 17:15
 */
public class MyBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        Course course=new Course();
        course.setcName("zbc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
