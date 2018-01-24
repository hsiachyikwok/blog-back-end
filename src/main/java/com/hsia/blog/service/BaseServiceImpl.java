package com.hsia.blog.service;

import com.hsia.blog.api.IBaseService;
import com.hsia.blog.util.PrimaryKeyUtil;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午12:07
 * @Description:
 */
public abstract class BaseServiceImpl implements IBaseService {
    @Override
    public String createId() {
        return PrimaryKeyUtil.generateShortUUID();
    }
}
