package com.example.demo.dao;

import javax.persistence.*;

/**
 * Created by xhou on 2018/8/25.
 */

@Entity
@Table(name = "t_program")
public class ProgramDao {

    @Id
    @GeneratedValue
    private int programId;

    @Column
    private String programName;

    @Column
    private String owner;

    @Column
    private String address;

    @Column
    private String detail;

    @Column
    private String programRateReturn;

    @Column
    private String createdTime;

    @Column
    private String modifiedTime;

    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
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
