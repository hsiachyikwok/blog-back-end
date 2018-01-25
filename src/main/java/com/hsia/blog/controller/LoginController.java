package com.hsia.blog.controller;

import com.hsia.blog.exception.GlobalException;
import com.hsia.blog.vo.ResponseVo;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.constraints.Size;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午5:51
 * @Description: 后台登录接口
 */
@RestController
@Slf4j
@Validated
public class LoginController {
    @RequestMapping("/")
    @SneakyThrows //不用显示throw
    public ResponseVo test(@RequestParam(value = "str")@Size(min = 1, max = 3,message = "str长度不对")String str,
                           @RequestParam(value = "str1")@Size(min = 1, max = 3,message = "str1长度不对1")String str1){
        log.info("1111");
        //throw new Exception();
        ResponseVo vo = new ResponseVo();
        vo.setBody("ee");
        return vo;
}
}
