package com.service;

import com.bean.Classes;

/**
 * 项目名:springdata1214
 * 日期:2018/12/15
 * 系统用户:Administrator
 * 面向对象面向君  不负代码不负卿
 */
public interface ClassesService  {

    //根据班级id进行查询(携带学生信息)
    public Classes findByClassid(int classid);

}
