package com.hsia.blog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午3:49
 * @Description:
 */
@Data
public class Navigation {
    private String id;

    private String navName;

    private String link;

    private int order;

    private String icon;

    private String blank;

    private Date createTime;

    private Date updateTime;
}
