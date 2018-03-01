package com.hsia.blog.interceptor;

import com.hsia.blog.exception.GlobalException;
import com.hsia.blog.util.SessionUtil;
import com.hsia.blog.vo.SessionInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午9:02
 * @Description: token拦截器
 */
@Slf4j
public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) {
        SessionInfo sessionInfo = null;
        //判断是否登录
        try {
            sessionInfo = SessionUtil.getSessionInfo(httpServletRequest.getSession(false));
        } catch (Exception e) {
            throw GlobalException.SESSION_OUT_OF_DATE;
        }
        //验证token
        if (!sessionInfo.getToken().equals(httpServletRequest.getParameter("token"))) {
            throw GlobalException.SESSION_OUT_OF_DATE;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) {
        //log.info("进入postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        //log.info("离开token拦截器");
    }
}
