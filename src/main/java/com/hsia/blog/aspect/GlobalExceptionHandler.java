package com.hsia.blog.aspect;
import com.hsia.blog.exception.GlobalException;
import com.hsia.blog.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午5:53
 * @Description: 全局异常处理，controller方法参数校验
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }

    @ExceptionHandler(value = GlobalException.class)
    @ResponseBody
    public ResponseVo globalExceptionHandler(GlobalException e){
        ResponseVo vo = new ResponseVo();
        vo.setCode(e.getCode());
        vo.setMessage(e.getMessage());
        return vo;
    }

    @ExceptionHandler(value = ValidationException.class)
    @ResponseBody
    public ResponseVo validationHandle(ConstraintViolationException e) {
        String message = " ";
        Set<ConstraintViolation<?>> set = e.getConstraintViolations();
        for (ConstraintViolation c:set) {
            message = message + c.getMessage()+" ";
        }
        ResponseVo vo = new ResponseVo();
        vo.setCode("-666");
        vo.setMessage(message);
        return vo;
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseVo exceptionHandler(Exception e){
        log.info("=======================================");
        log.info("Exception message: "+e.getMessage());
        log.info("=======================================");
        e.printStackTrace();
        ResponseVo vo = new ResponseVo();
        vo.setCode("-999");
        vo.setMessage(ResponseVo.ERROR_MESSAGE);
        return vo;
    }

}
