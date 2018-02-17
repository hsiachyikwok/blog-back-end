package com.hsia.blog.controller.category;

import com.hsia.blog.api.IArticleService;
import com.hsia.blog.entity.Article;
import com.hsia.blog.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: hsia
 * @Date: 2018/1/31 上午10:29
 * @Description:
 */
public class CategoryController {
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
