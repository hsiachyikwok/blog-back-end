package com.hsia.blog.mapper;

import com.hsia.blog.entity.CategoryArticleRef;

public interface CategoryArticleRefMapper {
    int deleteByPrimaryKey(String id);

    int insert(CategoryArticleRef record);

    int insertSelective(CategoryArticleRef record);

    CategoryArticleRef selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CategoryArticleRef record);

    int updateByPrimaryKey(CategoryArticleRef record);
}