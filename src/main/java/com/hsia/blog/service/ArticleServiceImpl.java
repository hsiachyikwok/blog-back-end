package com.hsia.blog.service;

import com.hsia.blog.api.IArticleService;
import com.hsia.blog.dao.ArticleMapper;
import com.hsia.blog.entity.Article;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
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
        articleMapper.insert(article);
    }

    @Override
    @Transactional
    public void updateArticle(Article article) {
        articleMapper.update(article);
    }

    @Override
    @Transactional
    public void delArticle(String id) {
        articleMapper.delete(id);
    }

    @Override
    public List<Article> listArticleByState(String state) {
        return articleMapper.selectArticleByState(state);
    }

    @Override
    public Article getArticle(String id) {
        return articleMapper.selectByPrimaryKey(id);
    }
}
