package com.hsia.blog.controller.article;

import com.hsia.blog.entity.Article;
import com.hsia.blog.vo.ResponseVo;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseVo addArticle(@ModelAttribute Article article){
        return new ResponseVo();
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseVo updateArticle(@ModelAttribute Article article){
        return new ResponseVo();
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseVo listArticle(){
        return new ResponseVo();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseVo delArticle(@PathVariable String id){
        return new ResponseVo();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseVo getArticle(@PathVariable String id){
        return new ResponseVo();
    }


}
