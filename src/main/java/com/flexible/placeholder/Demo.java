package com.flexible.placeholder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Autowired
    MDataSource mDataSource;
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:placeholder/beans");
        System.out.println( new Demo().mDataSource.toString());

    }
}
