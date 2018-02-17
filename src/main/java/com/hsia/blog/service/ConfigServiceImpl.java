package com.hsia.blog.service;

import com.hsia.blog.api.IConfigService;
import com.hsia.blog.entity.Config;
import com.hsia.blog.mapper.ConfigMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

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
        configMapper.updateByPrimaryKey(config);
    }

    @Override
    public Config getConfig() {
        return configMapper.getConfig();
    }
}
