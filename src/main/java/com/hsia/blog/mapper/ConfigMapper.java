package com.hsia.blog.mapper;

import com.hsia.blog.entity.Config;

import java.util.Map;

public interface ConfigMapper {
    int deleteByPrimaryKey(String id);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKeyWithBLOBs(Config record);

    int updateByPrimaryKey(Config record);

    Config getConfig();

    Map getUserInfo();
}