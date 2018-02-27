package com.hsia.blog.service;

import com.hsia.blog.api.IConfigService;
import com.hsia.blog.api.ILoginService;
import com.hsia.blog.vo.LoginVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Map;
import static com.hsia.blog.util.EncrypUtil.getMD5Str;

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
    public String login(LoginVo vo) throws Exception {
        Map userInfo =  configService.getUserInfo();
        if(!vo.getUsername().equals(userInfo.get("user_name"))){
            throw new Exception("用户名或密码错误");
        }
        if(!vo.getPassword().equals(userInfo.get("password"))){
            throw new Exception("用户名或密码错误");
        }
        return getMD5Str(vo.getUsername()+vo.getSessionId());
    }

    @Override
    public void logout() {

    }
}
