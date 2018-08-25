package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xhou on 2018/8/24.
 */
@ApiModel
public class LoginResponse{
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("userId")
    private String userId;
    @ApiModelProperty("个人预期年化汇报率")
    private String personal_rate_return;

    private int code;

    private String message;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPersonal_rate_return() {
        return personal_rate_return;
    }

    public void setPersonal_rate_return(String personal_rate_return) {
        this.personal_rate_return = personal_rate_return;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
