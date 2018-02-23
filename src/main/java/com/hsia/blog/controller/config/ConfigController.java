package com.hsia.blog.controller.config;

import com.hsia.blog.api.IConfigService;
import com.hsia.blog.entity.Config;
import com.hsia.blog.vo.ResponseVo;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hsia
 * @Date: 2018/1/31 上午10:29
 * @Description: 更新配置接口
 */
@Api("配置接口")
@RestController
@RequestMapping("/config")
@Slf4j
public class ConfigController {

    @Autowired
    private IConfigService configService;

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseVo updateConfig(@ModelAttribute Config config){
        configService.updateConfig(config);
        return new ResponseVo();
    }

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public ResponseVo getConfig(){
        ResponseVo vo = new ResponseVo();
        vo.setBody(configService.getConfig());
        return vo;
    }
}
