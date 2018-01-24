package com.hsia.blog.vo;

import lombok.Data;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午5:38
 * @Description:
 */
@Data
public class ResponseVo {
    public static final String ERROR_MESSAGE="error!";
    public static final String SUCCESS_MESSAGE="success!";
    private String code;

    private String message = SUCCESS_MESSAGE;

    private Object Body;

}
