package com.hsia.blog.controller.article;

import com.hsia.blog.api.IArticleService;
import com.hsia.blog.entity.Article;
import com.hsia.blog.vo.ResponseVo;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;

/**
 * @author: hsia
 * @Date: 2018/1/25 下午5:17
 * @Description: 文章CRUD
 */
@Api("文章接口")
@RestController
@RequestMapping("/article")
@Slf4j
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseVo addArticle(@ModelAttribute Article article){
        articleService.addArticle(article);
        return new ResponseVo();
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseVo updateArticle(@ModelAttribute Article article){
        articleService.updateArticle(article);
        return new ResponseVo();
    }

    @RequestMapping(value = "/list/{state}",method = RequestMethod.POST)
    public ResponseVo listArticle(@PathVariable String state,int pageNum,int pageSize){
        ResponseVo vo = new ResponseVo();
        vo.setBody(articleService.listArticleByState(state,pageNum,pageSize));
        return vo;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseVo deleteArticle(@PathVariable String id){
        articleService.deleteArticle(id);
        return new ResponseVo();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseVo getArticle(@PathVariable String id){
        ResponseVo vo = new ResponseVo();
        vo.setBody(articleService.getArticle(id));
        return vo;
    }

    @RequestMapping(value = "/tag/{tagName}",method = RequestMethod.POST)
    public ResponseVo getArticleByTag(@PathVariable String tagName,int pageNum,int pageSize){
        ResponseVo vo = new ResponseVo();
        vo.setBody(articleService.getArticleListByTag(tagName,pageNum,pageSize));
        return vo;
    }

    @RequestMapping(value = "/category/{catName}",method = RequestMethod.POST)
    public ResponseVo getArticleByCategory(@PathVariable String catName,int pageNum,int pageSize){
        ResponseVo vo = new ResponseVo();
        vo.setBody(articleService.getArticleListByCategory(catName,pageNum,pageSize));
        return vo;
    }

}
