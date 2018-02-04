package com.hsia.blog.mapper;

import com.hsia.blog.entity.Article;

public interface ArticleMapper {
    int deleteByPrimaryKey(String id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
}