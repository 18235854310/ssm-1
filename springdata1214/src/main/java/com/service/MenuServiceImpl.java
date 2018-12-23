package com.service;

import com.bean.Menu;
import com.dao.MenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目名:springdata1214
 * 日期:2018/12/15
 * 系统用户:Administrator
 * 面向对象面向君  不负代码不负卿
 */
@Service("mservice")
public class MenuServiceImpl implements  MenuService {

    @Autowired
    private MenuDao menuDao;

    public List<Menu> getall() {
        return menuDao.findAll();
    }
}
