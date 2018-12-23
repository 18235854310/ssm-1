package com.dao;

import com.bean.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * 项目名:springdata1214
 * 日期:2018/12/14
 * 系统用户:Administrator
 * 面向对象面向君  不负代码不负卿
 */
public interface UsersDao extends JpaRepository<Users,Integer> {

    //根据用户姓名进行查询
    public  Users findByUsername(String username);
    public Users findByUsernameAndPassword(String username,String password);
   //between
    public List<Users> findByUseridBetween(int begin,int end);
    public List<Users> findByBirthdayBetween(Date begin, Date end);
    public List<Users> findByBirthdayGreaterThanEqual(Date date);
    public List<Users> findByPasswordIsNull();
  //根据姓名进行模糊查
    public List<Users> findByUsernameLike(String username);//传值: %a%
    public List<Users> findByUsernameStartingWith(String username);//传值: a
    public List<Users> findByUsernameEndingWith(String username);//传值: a
    public List<Users> findByUsernameContaining(String username);//传值: a
    //根据用户名或密码进行模糊查询,结果根据用户id降序排序
    public List<Users> findByUsernameContainingOrPasswordContainingOrderByUseridDesc(String username,String password);
   //in查询
    public List<Users> findByUseridIn(int[] ids);
   //查询用户名包含某个值的条数
    public  int   countByUsernameContaining(String username);
   //根据用户名或密码进行模糊查询,结果根据用户id降序排序
    public List<Users> findByUsernameContainingOrPasswordContaining(String username, String password, Sort sort);
    //根据用户姓名进行查询+分页
    public Page findByUsernameContaining(String username, Pageable pageable);

    //多表条件的查询
    //根据用户姓名和班级名称进行模糊查询
    public List<Users> findByUsernameContainingAndClasses_ClassnameContaining(String username,String classname);


    //根据用户名密码进行查询
    //语句分为两种:1.jpql-通过操作实体类,来操作数据表（表名=类名，列名=属性名）
    // 2.原生sql
    //@Query(" from Users where username=?1 and password=?2")
    //public List<Users> login(String uname,String upass);

    //@Query("from Users where username=:uname and password=:pass")
    //public List<Users> login(@Param("uname") String uname,@Param("pass") String upass);
    @Query("from Users where username like %:uname% and password like %:upass% ")
    public List<Users> login(@Param("uname") String uname,@Param("upass")  String upass);

    //根据班级编号查询学生列表
   /* @Query("from Users where classes.classid=?1")
    public List<Users> findbycid(int classid);*/

    @Query(value = "select * from users where classid=?1",nativeQuery = true)
    public List<Users> findbycid(int classid);



}
