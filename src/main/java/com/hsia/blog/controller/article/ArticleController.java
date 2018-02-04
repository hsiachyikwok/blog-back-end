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
@Api("文章操作接口")
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

    @RequestMapping(value = "/list/{state}",method = RequestMethod.GET)
    public ResponseVo listArticle(@PathVariable String state){
        ResponseVo vo = new ResponseVo();
        vo.setBody(articleService.listArticleByState(state));
        return vo;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseVo delArticle(@PathVariable String id){
        articleService.delArticle(id);
        return new ResponseVo();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseVo getArticle(@PathVariable String id){
        ResponseVo vo = new ResponseVo();
        vo.setBody(articleService.getArticle(id));
        return vo;
    }

}
