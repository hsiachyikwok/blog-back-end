package com.hsia.blog.service;

import com.github.pagehelper.PageInfo;
import com.hsia.blog.api.IArticleService;
import com.hsia.blog.entity.Article;
import com.hsia.blog.mapper.ArticleMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/1/25 下午5:37
 * @Description:
 */
@Service
@Slf4j
public class ArticleServiceImpl extends BaseServiceImpl implements IArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    @Transactional
    public void addArticle(Article article) {
        article.setId(createId());
        article.setIsDel("0");
        article.setCreateTime(new Date());
        article.setUpdateTime(new Date());
        articleMapper.insertSelective(article);
    }

    @Override
    @Transactional
    public void updateArticle(Article article) {
        articleMapper.updateByPrimaryKeySelective(article);
    }

    @Override
    @Transactional
    public void deleteArticle(String id) {
        //articleMapper.delete(id);
    }

    @Override
    public Object listArticleByState(String state, int pageNum, int pageSize) {
        List<Article> articles = articleMapper.selectArticleByState(state, pageNum, pageSize);
        PageInfo<Article> pageInfo = new PageInfo(articles);
        return pageInfo;
    }

    @Override
    public Article getArticle(String id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public Object getArticleListByTag(String tagName, int pageNum, int pageSize) {
        List<Article> articles = articleMapper.selectArticleListByTag(tagName, pageNum, pageSize);
        PageInfo<Article> pageInfo = new PageInfo(articles);
        return pageInfo;
    }

    @Override
    public Object getArticleListByCategory(String catName, int pageNum, int pageSize) {
        List<Article> articles = articleMapper.selectArticleListByCategory(catName, pageNum, pageSize);
        PageInfo<Article> pageInfo = new PageInfo(articles);
        return pageInfo;
    }
}
