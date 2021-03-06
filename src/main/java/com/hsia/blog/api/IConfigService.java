package com.hsia.blog.api;

import com.hsia.blog.entity.Config;

import java.util.Map;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:03
 * @Description:
 */
public interface IConfigService {
    /**
     * 更新配置
     * @param config
     */
    void updateConfig(Config config);

    /**
     * 获取配置
     * @return
     */
    Config getConfig();

    /**
     * 获取用户信息
     * @return
     */
    Map getUserInfo();
}
