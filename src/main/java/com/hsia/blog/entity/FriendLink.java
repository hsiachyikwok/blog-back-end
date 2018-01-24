package com.hsia.blog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午3:49
 * @Description:
 */
@Data
public class FriendLink {
    private String id;

    private String linkTitle;

    private String link;

    private int order;

    private Date createTime;

    private Date updateTime;
}
