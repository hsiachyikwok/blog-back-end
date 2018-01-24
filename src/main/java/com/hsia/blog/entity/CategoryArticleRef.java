package com.hsia.blog.entity;

import lombok.Data;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午3:50
 * @Description:
 */
@Data
public class CategoryArticleRef {
    private String id;

    private String articleId;

    private String categoryId;
}
