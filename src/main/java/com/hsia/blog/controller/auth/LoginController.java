package com.hsia.blog.controller.auth;

import com.hsia.blog.api.ILoginService;
import com.hsia.blog.exception.GlobalException;
import com.hsia.blog.vo.LoginVo;
import com.hsia.blog.vo.ResponseVo;
import io.swagger.annotations.*;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Size;

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
    public ResponseVo login(@ModelAttribute LoginVo loginVo){
        ResponseVo vo = new ResponseVo();
        vo.setBody(loginService.login(loginVo));
        return vo;
    }
    @ApiOperation("登出")
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ResponseVo logout(){
        loginService.logout();
        ResponseVo vo = new ResponseVo();
        return vo;
    }
    }
