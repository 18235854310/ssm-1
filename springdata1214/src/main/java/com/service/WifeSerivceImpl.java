package com.service;

import com.bean.Wife;
import com.dao.WifeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目名:springdata1214
 * 日期:2018/12/15
 * 系统用户:Administrator
 * 面向对象面向君  不负代码不负卿
 */
@Service
public class WifeSerivceImpl implements  WifeSerivce {

    @Autowired
    private WifeDao wifeDao;
    public List<Wife> getall() {
        return wifeDao.findAll();
    }
}
