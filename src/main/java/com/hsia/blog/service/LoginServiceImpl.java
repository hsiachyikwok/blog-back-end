package com.hsia.blog.service;

import com.hsia.blog.api.IConfigService;
import com.hsia.blog.api.ILoginService;
import com.hsia.blog.exception.user.UserException;
import com.hsia.blog.vo.LoginVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:29
 * @Description:
 */
@Service
@Slf4j
public class LoginServiceImpl implements ILoginService {
    @Resource
    private IConfigService configService;

    @Override
    public void login(LoginVo vo) {
        Map userInfo = configService.getUserInfo();
        if (!vo.getUsername().equals(userInfo.get("user_name"))) {
            throw UserException.USERNAME_PASSWORD_ERROR;
        }
        if (!vo.getPassword().equals(userInfo.get("password"))) {
            throw UserException.USERNAME_PASSWORD_ERROR;
        }
    }
}
