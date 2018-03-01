package com.hsia.blog.exception.user;

import com.hsia.blog.exception.GlobalException;
import lombok.ToString;

/**
 * @author: hsia
 * @Date: 2018/3/1 下午1:50
 * @Description: 用户异常
 */
@ToString
public class UserException extends GlobalException {
    public UserException(String code, String message) {
        super(code, message);
    }

    public static final UserException USERNAME_PASSWORD_ERROR = new UserException("100","用户名或密码错误");

    public static final UserException GENERATE_SESSION_FAIL = new UserException("101","生成session失败");

    public static final UserException GET_SESSION_FAIL = new UserException("102","获取session失败");
}
