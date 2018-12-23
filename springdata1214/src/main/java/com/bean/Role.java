package com.bean;

import javax.persistence.*;
import java.util.List;

/**
 * 项目名:springdata1214
 * 日期:2018/12/15
 * 系统用户:Administrator
 * 面向对象面向君  不负代码不负卿
 */
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int roleId;
    @Column
    private String roleName;


    @ManyToMany
    @JoinTable(name = "middle",
    joinColumns = {@JoinColumn(name = "roleid")},
    inverseJoinColumns = {@JoinColumn(name = "menuid")})
    private List<Menu> menus;



    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }




    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
