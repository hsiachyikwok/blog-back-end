package com.hsia.blog.controller.nav;

import com.hsia.blog.api.IArticleService;
import com.hsia.blog.api.INavService;
import com.hsia.blog.entity.Article;
import com.hsia.blog.entity.Navigation;
import com.hsia.blog.mapper.NavigationMapper;
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
@Api("导航栏接口")
@RestController
@RequestMapping("/nav")
@Slf4j
public class NavController {

    @Autowired
    private INavService navService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseVo addNavigation(@ModelAttribute Navigation navigation){
        navService.addNav(navigation);
        return new ResponseVo();
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseVo updateNavigation(@ModelAttribute Navigation navigation){
        navService.updateNav(navigation);
        return new ResponseVo();
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseVo listNavigation(){
        ResponseVo vo = new ResponseVo();
        vo.setBody(navService.listNav());
        return vo;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseVo deleteNavigation(@PathVariable String id){
        navService.deleteNav(id);
        return new ResponseVo();
    }
}
