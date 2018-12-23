package com.service;

import com.bean.Users;
import com.dao.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 项目名:springdata1214
 * 日期:2018/12/14
 * 系统用户:Administrator
 * 面向对象面向君  不负代码不负卿
 */
@Service("uservice")
public class UsersServiceImpl implements  UsersService {
    @Autowired
    private UsersDao dao;

    public List<Users> findByUsernameContainingAndClasses_ClassnameContaining(String username, String classname) {
        return dao.findByUsernameContainingAndClasses_ClassnameContaining(username,classname);
    }

    public List<Users> login(String uname, String upass) {
        return dao.login(uname,upass);
    }

    public List<Users> findbycid(int classid) {
        return dao.findbycid(classid);
    }

    public int insert(Users users) {
        dao.save(users);
        return 0;
    }

    public int delete(int userid) {
        dao.delete(userid);
        return 0;
    }

    public int update(Users users) {
        dao.save(users);
        return 0;
    }

    public Users selectone(int userid) {

        return dao.findOne(userid);
    }

    public List<Users> selectall() {
        return dao.findAll();
    }

    public long countnum() {
        return dao.count();
    }

    public Users findByUsername(String username) {
        return dao.findByUsername(username);
    }

    public Users findByUsernameAndPassword(String username, String password) {
        return dao.findByUsernameAndPassword(username,password);
    }

    public List<Users> findByUseridBetween(int begin, int end) {
        return dao.findByUseridBetween(begin,end);
    }

    public List<Users> findByBirthdayBetween(Date begin, Date end) {
        return dao.findByBirthdayBetween(begin,end);
    }

    public List<Users> findByPasswordIsNull() {
        return dao.findByPasswordIsNull();
    }

    public List<Users> findByUsernameLike(String username) {
        return dao.findByUsernameLike(username);
    }

    public List<Users> findByUsernameContainingOrPasswordContainingOrderByUseridDesc(String username, String password) {
        return dao.findByUsernameContainingOrPasswordContainingOrderByUseridDesc(username,password);
    }

    public List<Users> findByUseridIn(int[] ids) {
        return dao.findByUseridIn(ids);
    }

    public int countByUsernameContaining(String username) {
        return dao.countByUsernameContaining(username);
    }

    public List<Users> findByUsernameContainingOrPasswordContaining(String username, String password, Sort sort) {
        return dao.findByUsernameContainingOrPasswordContaining(username, password, sort);
    }

    public Page findByUsernameContaining(String username, Pageable pageable) {
        return dao.findByUsernameContaining(username,pageable);
    }


}
