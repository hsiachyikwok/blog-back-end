package com.hsia.blog.service;

import com.github.pagehelper.PageInfo;
import com.hsia.blog.api.IArticleService;
import com.hsia.blog.entity.Archive;
import com.hsia.blog.entity.Article;
import com.hsia.blog.entity.Tag;
import com.hsia.blog.mapper.ArchiveMapper;
import com.hsia.blog.mapper.ArticleMapper;
import com.hsia.blog.mapper.TagMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    @Resource
    private ArchiveMapper archiveMapper;

    @Resource
    private TagMapper tagMapper;

    @Override
    @Transactional
    public void addArticle(Article article) {
        article.setId(createId());
        article.setIsDel("0");
        article.setCreateTime(new Date());
        article.setUpdateTime(new Date());
        articleMapper.insertSelective(article);
        Date now = getTodayDate(new Date());
        Archive archive = archiveMapper.getArchiveByDate(now);

        if (archive == null) {
            archive = new Archive();
            archive.setId(createId());
            archive.setArchiveTime(now);
            archive.setArticleCount(0);
            archive.setCreateTime(new Date());
            archive.setUpdateTime(new Date());
            archiveMapper.insertSelective(archive);
        } else {
            archive.setUpdateTime(new Date());
            archive.setArticleCount(archive.getArticleCount() + 1);
            archiveMapper.updateByPrimaryKeySelective(archive);
        }

        String[] tags = article.getTags().split(",");
        mantainTags(tags, article.getId());
    }

    @Override
    @Transactional
    public void updateArticle(Article article) {
        Article record = articleMapper.selectByPrimaryKey(article.getId());
        if (record == null) {
            //throw
        }
        articleMapper.updateByPrimaryKeySelective(article);
        String[] tags = article.getTags().split(",");
        mantainTags(tags, article.getId());
    }

    @Override
    @Transactional
    public void deleteArticle(String id) {
        Article record = articleMapper.selectByPrimaryKey(id);
        if (record == null) {
            //throw
        }
        record.setUpdateTime(new Date());
        record.setIsDel("1");
        articleMapper.updateByPrimaryKeySelective(record);

        Archive archive = archiveMapper.getArchiveByDate(getTodayDate(record.getCreateTime()));
        archive.setUpdateTime(new Date());
        archive.setArticleCount(archive.getArticleCount() - 1);
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

    /**
     * 维护标签表
     *
     * @param tags
     * @param id
     */
    private void mantainTags(String[] tags, String id) {
        for (int i = 0; i < tags.length; i++) {
            Tag tag = tagMapper.selectByTagName(tags[i]);
            if (tag == null) {
                tag = new Tag();
                tag.setId(createId());
                tag.setCreateTime(new Date());
                tag.setUpdateTime(new Date());
                tag.setTagName(tags[i]);
                tag.setTagDesc(id);
                tagMapper.insertSelective(tag);
            } else {
                tag.setUpdateTime(new Date());
                tag.setTagDesc(id);
                tagMapper.updateByPrimaryKeySelective(tag);
            }
        }
    }

    private Date getTodayDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(dateFormat.format(date));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
