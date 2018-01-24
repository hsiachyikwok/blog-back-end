package com.hsia.blog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午3:44
 * @Description:
 */
@Data
public class Tag {

    private String id;

    private String tagName;

    private String tagDesc;

    private Date createTime;

    private Date updateTime;
}
