package com.flexible.editor;

import com.flexible.editor.editorbean.Boss;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * �Զ������Ա༭��
 */
public class Demo {



    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:editor/beans");
        Boss boss = (Boss) context.getBean("boss");
        System.out.println(boss.toString());
    }
}
