package com.hsia.blog.controller.tag;

import com.hsia.blog.api.ITagService;
import com.hsia.blog.entity.Tag;
import com.hsia.blog.vo.ResponseVo;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: hsia
 * @Date: 2018/1/31 上午10:30
 * @Description:
 */
@Api("标签接口")
@RestController
@RequestMapping("/tag")
@Slf4j
public class TagController {
    @Autowired
    private ITagService tagService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseVo addTag(@ModelAttribute Tag tag){
        tagService.addTag(tag);
        return new ResponseVo();
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseVo updateTag(@ModelAttribute Tag tag){
        tagService.updateTag(tag);
        return new ResponseVo();
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseVo listTag(){
        ResponseVo vo = new ResponseVo();
        vo.setBody(tagService.listTag());
        return vo;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseVo deleteTag(@PathVariable String id){
        tagService.deleteTag(id);
        return new ResponseVo();
    }
}
