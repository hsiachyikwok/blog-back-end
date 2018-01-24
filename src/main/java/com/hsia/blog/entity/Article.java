package com.hsia.blog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午3:49
 * @Description:
 */
@Data
public class Article {
    private String id;

    private String articleTitle;

    private String articleLink;

    private String picture;

    private String content;

    private String tags;

    private String type;

    private String isTop;

    private String allowComment;

    private int commentCount;

    private int viewCount;

    private String isDel;

    private Date createTime;

    private Date updateTime;
}
