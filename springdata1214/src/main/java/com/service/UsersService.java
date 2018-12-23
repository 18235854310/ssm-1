package com.service;

import com.bean.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Date;
import java.util.List;

/**
 * 项目名:springdata1214
 * 日期:2018/12/14
 * 系统用户:Administrator
 * 面向对象面向君  不负代码不负卿
 */
public interface UsersService {
    //增删改查
    public int insert(Users users);
    public int delete(int userid);
    public int update(Users users);
    public Users selectone(int userid);
    public List<Users> selectall();
    public long countnum();//计算行数


    //根据用户姓名进行查询
    public  Users findByUsername(String username);
    public Users findByUsernameAndPassword(String username,String password);
    public List<Users> findByUseridBetween(int begin,int end);
    public List<Users> findByBirthdayBetween(Date begin, Date end);
    public List<Users> findByPasswordIsNull();
    public List<Users> findByUsernameLike(String username);
    public List<Users> findByUsernameContainingOrPasswordContainingOrderByUseridDesc(String username,String password);
    //in查询
    public List<Users> findByUseridIn(int[] ids);
    //查询用户名包含某个值的条数
    public  int   countByUsernameContaining(String username);
    public List<Users> findByUsernameContainingOrPasswordContaining(String username, String password, Sort sort);
    //根据用户姓名进行查询+分页
    public Page findByUsernameContaining(String username, Pageable pageable);



    public List<Users> findByUsernameContainingAndClasses_ClassnameContaining(String username,String classname);

    public List<Users> login(String uname,String upass);
    public List<Users> findbycid(int classid);

}
