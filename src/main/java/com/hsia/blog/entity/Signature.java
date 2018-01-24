package com.hsia.blog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午3:49
 * @Description:
 */
@Data
public class Signature {
    private String id;

    private String content;

    private Date createTime;

    private Date updateTime;
}
