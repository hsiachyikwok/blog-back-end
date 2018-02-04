package com.hsia.blog.mapper;

import com.hsia.blog.entity.FriendLink;

public interface FriendLinkMapper {
    int deleteByPrimaryKey(String id);

    int insert(FriendLink record);

    int insertSelective(FriendLink record);

    FriendLink selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(FriendLink record);

    int updateByPrimaryKey(FriendLink record);
}