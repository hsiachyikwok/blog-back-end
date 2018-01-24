package com.hsia.blog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午3:48
 * @Description:
 */
@Data
public class Archive {
    private String id;

    private Date archiveTime;

    private  Date createTime;

    private Date updateTime;
}
