package com.hsia.blog.entity;

import java.util.Date;

public class Category {
    private String id;

    private String catName;

    private String catDesc;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc == null ? null : catDesc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}