package com.hsia.blog.controller.auth;

import com.hsia.blog.exception.GlobalException;
import com.hsia.blog.vo.ResponseVo;
import io.swagger.annotations.*;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
@Api("登录")
@RequestMapping("/admin")
public class LoginController {
    @ApiOperation("登录")
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "header", name = "username", dataType = "String", required = true,
                    value = "用户的姓名", defaultValue = "xiaoqiang"),
            @ApiImplicitParam(paramType = "query", name = "password", dataType = "String", required = true, value = "用户的密码",
                    defaultValue = "xiaoxiong")
    })
    @RequestMapping(value = "/login",method = RequestMethod.GET)
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
