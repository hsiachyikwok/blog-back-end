package com.hsia.blog.controller.friendlink;

import com.hsia.blog.api.IArticleService;
import com.hsia.blog.api.IFriendLinkService;
import com.hsia.blog.entity.Article;
import com.hsia.blog.entity.FriendLink;
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
@Api("友链接口")
@RestController
@RequestMapping("/friendlink")
@Slf4j
public class FriendLinkController {
    @Autowired
    private IFriendLinkService friendLinkService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseVo addFriendLink(@ModelAttribute FriendLink friendlink){
        friendLinkService.addFriendLink(friendlink);
        return new ResponseVo();
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseVo updateArticle(@ModelAttribute FriendLink friendlink){
        friendLinkService.updateFriendLink(friendlink);
        return new ResponseVo();
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseVo listFriendLink(){
        ResponseVo vo = new ResponseVo();
        vo.setBody(friendLinkService.listFriendLink());
        return vo;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseVo deleteFriendLink(@PathVariable String id){
        friendLinkService.deleteFriendLink(id);
        return new ResponseVo();
    }
}
