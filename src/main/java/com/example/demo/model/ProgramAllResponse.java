package com.example.demo.model;

import com.example.demo.dao.ProgramDao;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by xhou on 2018/8/26.
 */
@ApiModel
public class ProgramAllResponse {

    private int code;

    private String message;

    @ApiModelProperty("所有项目列表")
    private List<ProgramDao> programDaoList;

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

    public List<ProgramDao> getProgramDaoList() {
        return programDaoList;
    }

    public void setProgramDaoList(List<ProgramDao> programDaoList) {
        this.programDaoList = programDaoList;
    }
}
