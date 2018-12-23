package com.test;

import com.bean.Users;
import com.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 项目名:springdata1214
 * 日期:2018/12/14
 * 系统用户:Administrator
 * 面向对象面向君  不负代码不负卿
 */
public class Test1 {

    public static void main(String[] args) {
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("spring-data.xml");
        UsersService service=(UsersService) applicationContext.getBean("uservice");

        /*List<Users>  users=
                service.findByUsernameContainingAndClasses_ClassnameContaining("a","分析");
        for (Users user : users) {
            System.out.println(user.getUsername()+"..."+user.getClasses().getClassname());
        }*/

     /*   List<Users> list= service.login("a","b");
        System.out.println(list.get(0).getUsername()+".......");

*/

        List<Users> list=service.findbycid(1);
        for (Users users : list) {
            System.out.println(users.getUsername());
        }

      //  service.insert(new Users("张三","abc",new Date()));
       // Users users=service.selectone(1);
       // System.out.println(users.getUsername());
        /*List<Users> list=service.selectall();
        for (Users users : list) {
            System.out.println(users.getUsername());
        }*/
       // System.out.println(service.countnum());
    }

}
