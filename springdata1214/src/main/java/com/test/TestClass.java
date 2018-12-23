package com.test;

import com.bean.Classes;
import com.bean.Users;
import com.service.ClassesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 项目名:springdata1214
 * 日期:2018/12/15
 * 系统用户:Administrator
 * 面向对象面向君  不负代码不负卿
 */
public class TestClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("spring-data.xml");
        ClassesService service=(ClassesService) applicationContext.getBean("cservice");

        Classes classes=service.findByClassid(1);
        System.out.println(classes.getClassname()+"-------------");
        List<Users> list=classes.getUsers();
        for (Users users : list) {
            System.out.println("\t"+users.getUsername());
        }

    }
}
