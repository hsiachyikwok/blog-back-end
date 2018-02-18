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
    List<Article> listArticleByState(String state);

    /**
     * getArticle
     * @param id
     * @return
     */
    Article getArticle(String id);
}
