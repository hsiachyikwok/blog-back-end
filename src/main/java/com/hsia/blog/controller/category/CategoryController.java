package com.hsia.blog.controller.category;

import com.hsia.blog.api.ICategoryService;
import com.hsia.blog.entity.Article;
import com.hsia.blog.entity.Category;
import com.hsia.blog.vo.ResponseVo;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: hsia
 * @Date: 2018/1/31 上午10:29
 * @Description:
 */
@Api("分类接口")
@RestController
@RequestMapping("/category")
@Slf4j
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseVo addCategory(@ModelAttribute Category category){
        categoryService.addCategory(category);
        return new ResponseVo();
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseVo updateCategory(@ModelAttribute Category category){
        categoryService.updateCategory(category);
        return new ResponseVo();
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseVo listCategory(){
        ResponseVo vo = new ResponseVo();
        vo.setBody(categoryService.listCategory());
        return vo;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseVo deleteCategory(@PathVariable String id){
        categoryService.deleteCategory(id);
        return new ResponseVo();
    }

}
