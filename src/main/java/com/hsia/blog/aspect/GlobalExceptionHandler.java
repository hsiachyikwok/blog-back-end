package com.hsia.blog.aspect;
import com.hsia.blog.exception.GlobalException;
import com.hsia.blog.vo.ResponseVo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author: hsia
 * @Date: 2018/1/24 下午5:53
 * @Description: 全局异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseVo exceptionHandler(Exception e){
        ResponseVo vo = new ResponseVo();
        if(e instanceof GlobalException) {
            GlobalException e1 = (GlobalException)e;
            vo.setCode(e1.getCode());
            vo.setMessage(e.getMessage());
        }else{
            vo.setCode("-999");
            vo.setMessage(ResponseVo.ERROR_MESSAGE);
        }
        return vo;
    }
}
