package com.hsia.blog.service;

import com.hsia.blog.api.ILoginService;
import com.hsia.blog.vo.LoginVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:29
 * @Description:
 */
@Service
@Slf4j
public class LoginServiceImpl implements ILoginService {
    @Override
    public String login(LoginVo vo) {
        return "19940923";
    }

    @Override
    public void logout() {

    }
}
