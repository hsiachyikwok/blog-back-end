package com.hsia.blog.vo;

import lombok.Data;

/**
 * @author: hsia
 * @Date: 2018/2/28 下午2:37
 * @Description:
 */
@Data
public class SessionInfo {
    /**
     * sessionId
     */
    private String sessionId;
    /**
     * 用户名
     */
    private String username;
    /**
     * token
     */
    private String token;
}
