package com.bean;

import javax.persistence.*;

/**
 * 项目名:springdata1214
 * 日期:2018/12/15
 * 系统用户:Administrator
 * 面向对象面向君  不负代码不负卿
 */
@Entity
public class Husband {
    @Id
    private int husid;
    @Column
    private String husname;

   @OneToOne
   @JoinColumn(name="wid")
    private Wife wife;

    public int getHusid() {
        return husid;
    }

    public void setHusid(int husid) {
        this.husid = husid;
    }

    public String getHusname() {
        return husname;
    }

    public void setHusname(String husname) {
        this.husname = husname;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
