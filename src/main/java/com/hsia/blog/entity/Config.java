package com.hsia.blog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午3:48
 * @Description:
 */
@Data
public class Config {
    private String id;

    private String userName;

    private String password;

    private String avatar;

    private String blogTitle;

    private String blogSubTitle;

    private String blog_logo;

    private String favicon;

    private String metaKeywords;

    private String metaDesc;

    private String footer;

    private String notice;

    private String allowComment;

    private String listStyle;

    private int recentCommentSize;

    private int pageSize;

    private int pageWidth;

    private int mostViewSize;

    private int mostCommentSize;

    private int usedTagSize;

    private Date createTime;

    private Date updateTime;

}
