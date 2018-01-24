package com.hsia.blog.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午6:17
 * @Description: 全局异常
 */
@ToString
@AllArgsConstructor
public class GlobalException extends RuntimeException {
    /**
     * code 有三位，第一位代表模块号，后面两位是异常编号。
     */
    @Getter @Setter private String code;

    @Getter @Setter private String message;

    public  static final GlobalException SESSION_OUT_OF_DATE = new GlobalException("000","会话超时");
}
