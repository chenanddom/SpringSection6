package com.flexible.containermessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.MessageFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-20
 * Time: 8:29
 */
public class ContainerMessageSource {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("containermessagesouece/beans");


        //格式化信息串
        String pattern1 = "{0},你好！你于{1}我行存入了{2}元";
        //用于动态替换占位符的参数
        Object[] params = {"张三",new GregorianCalendar().getTime(),1000000.0E3};
        String userName1 = context.getMessage("userName", params, Locale.CHINA);

        String userName2 = context.getMessage("userName", params, Locale.US);
        System.out.println("userName1:"+userName1+"---"+"userName2:"+userName2);

//        MessageSource
    }
}
