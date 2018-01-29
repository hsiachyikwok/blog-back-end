package com.hsia.blog.service;

import com.hsia.blog.api.IArticleService;
import com.hsia.blog.dao.ArticleMapper;
import com.hsia.blog.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/1/25 下午5:37
 * @Description:
 */
@Service
public class ArticleServiceImpl extends BaseServiceImpl implements IArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public void addArticle(Article article) {

    }

    @Override
    public void updateArticle(Article article) {

    }

    @Override
    public void delArticle(String id) {

    }

    @Override
    public List<Article> listArticleByState(String state) {
        return null;
    }

    @Override
    public Article getArticle(String id) {
        return null;
    }
}
