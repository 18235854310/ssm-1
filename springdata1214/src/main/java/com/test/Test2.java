package com.test;

import com.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 项目名:springdata1214
 * 日期:2018/12/14
 * 系统用户:Administrator
 * 面向对象面向君  不负代码不负卿
 */
public class Test2 {

    public static void main(String[] args) {
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("spring-data.xml");
        UsersService service=(UsersService) applicationContext.getBean("uservice");

        service.findByPasswordIsNull();

       // Users users=service.findByUsername("张三");
       // Users users = service.findByUsernameAndPassword("张三1", "abc");
      //  System.out.println(users.getPassword()+"---");
       // List<Users> list=service.findByUseridBetween(3,5);

            /*SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
            Date begin=dateFormat.parse("2018-12-12");
            Date end=dateFormat.parse("2018-12-15");
            List<Users> list=service.findByBirthdayBetween(begin,end);*/
           // List<Users> list=service.findByPasswordIsNull();
             // List<Users> list=service.findByUsernameLike("%a%");
       // List<Users> list=service.findByUsernameContainingOrPasswordContainingOrderByUseridDesc("三","f");
        /*   List ids=new ArrayList();
           ids.add(1);
          ids.add(3);
           ids.add(5);
           List<Users> list=service.findByUseridIn(ids);*/
          // List<Users> list=service.findByUseridIn(new int[]{2,4,6});
        //Sort sort=new Sort(Sort.Direction.DESC,"userid");
        //多列排序
       /* List sorts=new ArrayList();
        sorts.add(new Sort.Order(Sort.Direction.ASC,"username"));
        sorts.add(new Sort.Order(Sort.Direction.ASC,"userid"));
        Sort sort=new Sort(sorts);
        List<Users> list=service.findByUsernameContainingOrPasswordContaining("a","f",sort);
         */
       //分页的页码值从0开始
      /*  Sort sort=new Sort(Sort.Direction.DESC,"userid");
       Page page =service.findByUsernameContaining("a",new PageRequest(0,3,sort));
       List<Users> list= page.getContent();
       for (Users users : list) {
                System.out.println(users.getUserid()+",,,"+users.getUsername());
       }
        System.out.println("总条数:"+page.getTotalElements());
        System.out.println("总页数:"+page.getTotalPages());
        System.out.println("当前页码:"+(page.getNumber()+1));
        System.out.println("每页显示条数:"+page.getSize());
        System.out.println("当前页显示的条数:"+page.getNumberOfElements());
        System.out.println("上一页:"+(page.previousPageable()==null?1:page.previousPageable().getPageNumber()+1));
        System.out.println("下一页:"+(page.nextPageable()==null?page.getTotalPages():page.nextPageable().getPageNumber()+1));
*/
       // System.out.println("行数:"+service.countByUsernameContaining("a"));
    }

}
