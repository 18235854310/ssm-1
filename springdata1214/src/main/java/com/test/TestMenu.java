package com.test;

import com.bean.Menu;
import com.bean.Role;
import com.service.MenuService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 项目名:springdata1214
 * 日期:2018/12/15
 * 系统用户:Administrator
 * 面向对象面向君  不负代码不负卿
 */
public class TestMenu {
    public static void main(String[] args) {

        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("spring-data.xml");
        MenuService service=(MenuService) applicationContext.getBean("mservice");
        List<Menu> list=service.getall();
        for (Menu menu : list) {
            System.out.println(menu.getMenuname()+"-----");
            List<Role> roles=menu.getRoles();
            for (Role role : roles) {
                System.out.println("\t"+role.getRoleName());
            }

        }
    }
}
