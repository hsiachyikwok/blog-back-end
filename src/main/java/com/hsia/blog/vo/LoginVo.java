package com.hsia.blog.vo;

import lombok.Data;

import javax.servlet.http.HttpSession;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:23
 * @Description:
 */
@Data
public class LoginVo {

    String username;

    String password;

    HttpSession session;
}
