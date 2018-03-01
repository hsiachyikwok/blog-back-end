package com.hsia.blog.service;

import com.hsia.blog.api.IConfigService;
import com.hsia.blog.entity.Config;
import com.hsia.blog.mapper.ConfigMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:05
 * @Description:
 */
@Service
@Slf4j
public class ConfigServiceImpl implements IConfigService {
    @Resource
    private ConfigMapper configMapper;

    @Override
    @Transactional
    public void updateConfig(Config config) {
        config.setUpdateTime(new Date());
        configMapper.updateByPrimaryKey(config);
    }

    @Override
    public Config getConfig() {
        return configMapper.getConfig();
    }

    @Override
    public Map getUserInfo() {
        return configMapper.getUserInfo();
    }
}
