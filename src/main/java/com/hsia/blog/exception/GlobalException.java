package com.hsia.blog.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午6:17
 * @Description: 全局异常
 */
@ToString
public class GlobalException extends RuntimeException {

    @Getter @Setter private String code;

    @Getter @Setter private String message;

    public  static final GlobalException SESSION_OUT_OF_DATE = new GlobalException();
}
