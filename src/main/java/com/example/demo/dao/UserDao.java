package com.example.demo.dao;

import javax.persistence.*;

/**
 * Created by xhou on 2018/8/25.
 */

@Entity
@Table(name = "t_user")
public class UserDao {

    @Id
    @GeneratedValue
    private int userId;

    @Column
    private String userName;

    @Column
    private String password;

    @Column
    private String personalRateReturn;

    @Column
    private String createdTime;

    @Column
    private String modifiedTime;

    @Column
    public int getUserId() {
        return userId;
    }

    @Column
    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column
    public String getUserName() {
        return userName;
    }

    @Column
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonalRateReturn() {
        return personalRateReturn;
    }

    public void setPersonalRateReturn(String personalRateReturn) {
        this.personalRateReturn = personalRateReturn;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
