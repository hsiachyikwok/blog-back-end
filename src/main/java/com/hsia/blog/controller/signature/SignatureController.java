package com.hsia.blog.controller.signature;

import com.hsia.blog.api.IArticleService;
import com.hsia.blog.api.ISignatureService;
import com.hsia.blog.entity.Article;
import com.hsia.blog.entity.Signature;
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
@Api("签名接口")
@RestController
@RequestMapping("/signature")
@Slf4j
public class SignatureController {

    @Autowired
    private ISignatureService signatureService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseVo addSignature(@ModelAttribute Signature signature){
        signatureService.addSignature(signature);
        return new ResponseVo();
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseVo updateSignature(@ModelAttribute Signature signature){
        signatureService.updateSignature(signature);
        return new ResponseVo();
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseVo listSignature(){
        ResponseVo vo = new ResponseVo();
        vo.setBody(signatureService.listSignature());
        return vo;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseVo deleteSignature(@PathVariable String id){
        signatureService.deleteSignature(id);
        return new ResponseVo();
    }

}
