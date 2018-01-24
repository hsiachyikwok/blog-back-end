package com.hsia.blog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午3:48
 * @Description:
 */
@Data
public class Category {
    private String id;

    private String catName;

    private String catDesc;

    private Date createTime;

    private Date upDateTime;
}
