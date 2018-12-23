package com.test;

import com.bean.Wife;
import com.service.WifeSerivce;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 项目名:springdata1214
 * 日期:2018/12/15
 * 系统用户:Administrator
 * 面向对象面向君  不负代码不负卿
 */
public class TestWife {
    public static void main(String[] args) {

        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("spring-data.xml");
        WifeSerivce service=(WifeSerivce) applicationContext.getBean("wifeSerivceImpl");
        List<Wife> list=service.getall();
        for (Wife w: list) {
            System.out.println(w.getWifeName());
        }
    }
}
