package com.hsia.blog.controller;

import com.hsia.blog.exception.GlobalException;
import com.hsia.blog.vo.ResponseVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午5:51
 * @Description: 后台登录接口
 */
@RestController
public class LoginController {
    @RequestMapping("/")
    public ResponseVo test(){

        throw GlobalException.SESSION_OUT_OF_DATE;
//        ResponseVo vo = new ResponseVo();
//        vo.setBody("ee");
//        return vo;
}
}
