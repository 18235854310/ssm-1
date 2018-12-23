package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * 项目名:springdata1214
 * 日期:2018/12/15
 * 系统用户:Administrator
 * 面向对象面向君  不负代码不负卿
 */
@Entity
public class Wife {
    @Id
    private int wifeId;
    @Column
    private String wifeName;

    @OneToOne(mappedBy = "wife")
    private Husband husband;

    public int getWifeId() {
        return wifeId;
    }

    public void setWifeId(int wifeId) {
        this.wifeId = wifeId;
    }

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
}
