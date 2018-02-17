package com.hsia.blog.service;

import com.hsia.blog.api.ILoginService;
import com.hsia.blog.vo.LoginVo;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:29
 * @Description:
 */
public class LoginService implements ILoginService {
    @Override
    public String login(LoginVo vo) {
        return "19940923";
    }

    @Override
    public void logout() {

    }
}
