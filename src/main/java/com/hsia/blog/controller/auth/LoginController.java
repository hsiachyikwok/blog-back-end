package com.hsia.blog.controller.auth;

import com.hsia.blog.api.ILoginService;
import com.hsia.blog.vo.LoginVo;
import com.hsia.blog.vo.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


/**
 * @author: hsia
 * @Date: 2018/1/24 下午5:51
 * @Description: 后台登录接口
 */
@RestController
@Slf4j
@Validated
@Api("登录")
@RequestMapping("/admin")
public class LoginController {
    @Autowired
    private ILoginService loginService;

    @ApiOperation("登录")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResponseVo login(@ModelAttribute LoginVo loginVo,HttpSession session) throws Exception {
        loginVo.setSessionId(session.getId());
        ResponseVo vo = new ResponseVo();
        String token = loginService.login(loginVo);
        vo.setBody(token);
        return vo;
    }
    @ApiOperation("登出")
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public ResponseVo logout(){
        loginService.logout();
        return new ResponseVo();
    }
    }
