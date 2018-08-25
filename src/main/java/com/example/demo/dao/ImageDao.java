package com.example.demo.dao;

import javax.persistence.*;

/**
 * Created by xhou on 2018/8/25.
 */

@Entity
@Table(name = "t_program_image")
public class ImageDao {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private int programId;

    @Column
    private String image;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
