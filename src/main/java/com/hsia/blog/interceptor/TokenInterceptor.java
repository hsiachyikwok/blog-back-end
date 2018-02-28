package com.hsia.blog.interceptor;

import com.hsia.blog.util.EncrypUtil;
import com.hsia.blog.util.SessionUtil;
import com.hsia.blog.vo.SessionInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午9:02
 * @Description: token拦截器
 */
@Slf4j
public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        SessionInfo sessionInfo = null;
        //判断是否登录
        try {
            sessionInfo = SessionUtil.getSessionInfo(httpServletRequest.getSession(false));
        } catch (Exception e) {
            throw new Exception("会话超时");
        }
        //验证token
        if (!sessionInfo.getToken().equals(httpServletRequest.getParameter("token"))) {
            throw new Exception("会话超时");
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        //log.info("进入postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        //log.info("离开token拦截器");
    }
}
