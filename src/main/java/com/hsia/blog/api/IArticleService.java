package com.hsia.blog.api;

import com.hsia.blog.entity.Article;

import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/1/25 下午5:36
 * @Description:
 */
public interface IArticleService {
    /**
     * addArticle
     * @param article
     */
    void addArticle(Article article);

    /**
     * updateArticle
     * @param article
     */
    void updateArticle(Article article);

    /**
     * delArticle
     * @param id
     */
    void deleteArticle(String id);

    /**
     * listArticleByState
     * @param state
     * @return
     */
    Object listArticleByState(String state,int pageNum,int pageSize);

    /**
     * getArticle
     * @param id
     * @return
     */
    Article getArticle(String id);

    /**
     * 根据标签获取文章列表
     * @param tagName
     * @return
     */
    Object getArticleListByTag(String tagName,int pageNum,int pageSize);

    /**
     * 根据分类名获取文章列表
     * @param catName
     * @return
     */
    Object getArticleListByCategory(String catName,int pageNum,int pageSize);
}
