package com.bean;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

/**
 * 项目名:springdata1214
 * 日期:2018/12/15
 * 系统用户:Administrator
 * 面向对象面向君  不负代码不负卿
 */
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuid;
    @Column
    private String menuname;

    @ManyToMany(mappedBy = "menus")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Role> Roles;


    public List<Role> getRoles() {
        return Roles;
    }

    public void setRoles(List<Role> roles) {
        Roles = roles;
    }


    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }
}
