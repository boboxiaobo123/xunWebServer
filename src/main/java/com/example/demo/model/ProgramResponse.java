package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by xhou on 2018/8/25.
 */

@ApiModel
public class ProgramResponse {

    private int code;

    private String message;

    @ApiModelProperty("项目名称")
    private String programName;

    @ApiModelProperty("项目负责人")
    private String owner;

    @ApiModelProperty("项目地址")
    private String address;

    @ApiModelProperty("项目详情")
    private String detail;

    @ApiModelProperty("项目回报率")
    private String programRateReturn;

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

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getProgramRateReturn() {
        return programRateReturn;
    }

    public void setProgramRateReturn(String programRateReturn) {
        this.programRateReturn = programRateReturn;
    }

}
