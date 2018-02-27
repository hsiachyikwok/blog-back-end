package com.hsia.blog.mapper;

import com.hsia.blog.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ArticleMapper {
    int deleteByPrimaryKey(String id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);

    List<Article> selectArticleByState(@Param("type") String state);

    List<String> selectArticleNameByTime(@Param("archiveTime")Date archiveTime);

    List<Article> selectArticleListByTag(@Param("tagName")String tagName);

    List<Article> selectArticleListByCategory(@Param("catName")String catName);
}