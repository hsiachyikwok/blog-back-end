package com.hsia.blog.util;

import com.hsia.blog.vo.LoginVo;
import com.hsia.blog.vo.SessionInfo;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpSession;

/**
 * @author: hsia
 * @Date: 2018/2/28 下午2:19
 * @Description:
 */
@Slf4j
public class SessionUtil {
    /**
     * 生成session
     *
     * @param vo
     */
    public static void generateSession(LoginVo vo) throws Exception {
        HttpSession session = vo.getSession();
        SessionInfo sessionInfo = new SessionInfo();
        sessionInfo.setUsername(vo.getUsername());
        sessionInfo.setSessionId(session.getId());
        session.setAttribute("sessionInfo", sessionInfo);
        sessionInfo.setToken(generateSessionToken(vo));
    }

    /**
     * 获取登录信息
     *
     * @param session
     * @return
     */
    public static SessionInfo getSessionInfo(HttpSession session) throws Exception {
        SessionInfo sessionInfo = (SessionInfo) session.getAttribute("sessionInfo");
        if (sessionInfo == null) {
            throw new Exception("获取session失败");
        }
        return sessionInfo;
    }

    /**
     * 登出
     *
     * @param session
     */
    public static void logout(HttpSession session) {
        session.invalidate();
    }

    /**
     * 生成token
     *
     * @param vo
     * @return
     * @throws Exception
     */
    private static String generateSessionToken(LoginVo vo) throws Exception {
        SessionInfo sessionInfo = (SessionInfo) vo.getSession().getAttribute("sessionInfo");
        return EncrypUtil.getMD5Str(vo.getUsername() + sessionInfo.getSessionId());
    }
}
