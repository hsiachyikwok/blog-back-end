package com.hsia.blog.api;

import com.hsia.blog.vo.LoginVo;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:20
 * @Description:
 */
public interface ILoginService {
    /**
     * 登录接口
     * @param vo
     * @return token
     */
    void login(LoginVo vo);
}
