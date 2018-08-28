package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by xhou on 2018/8/25.
 */

@ApiModel
public class ProgramPersonalResponse {

    private int code;

    private String message;

    @ApiModelProperty("认购金额")
    private String subscription;

    @ApiModelProperty("投资开始时间")
    private String startDate;

    @ApiModelProperty("投资结束时间")
    private String endDate;

    @ApiModelProperty("项目编号")
    private List<Integer> programIds;

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

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public List<Integer> getProgramIds() {
        return programIds;
    }

    public void setProgramIds(List<Integer> programIds) {
        this.programIds = programIds;
    }
}
