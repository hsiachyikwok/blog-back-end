package com.hsia.blog.mapper;

import com.hsia.blog.entity.Navigation;

public interface NavigationMapper {
    int deleteByPrimaryKey(String id);

    int insert(Navigation record);

    int insertSelective(Navigation record);

    Navigation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Navigation record);

    int updateByPrimaryKey(Navigation record);
}