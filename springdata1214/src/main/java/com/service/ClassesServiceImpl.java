package com.service;

import com.bean.Classes;
import com.dao.ClassesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 项目名:springdata1214
 * 日期:2018/12/15
 * 系统用户:Administrator
 * 面向对象面向君  不负代码不负卿
 */
@Service("cservice")
public class ClassesServiceImpl implements  ClassesService {

    @Autowired
    private ClassesDao classesDao;

    public Classes findByClassid(int classid) {
        return classesDao.findByClassid(classid);
    }
}
