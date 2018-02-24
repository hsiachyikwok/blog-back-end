package com.hsia.blog.mapper;

import com.hsia.blog.entity.FriendLink;

import java.util.List;

public interface FriendLinkMapper {
    int deleteByPrimaryKey(String id);

    int insert(FriendLink record);

    int insertSelective(FriendLink record);

    FriendLink selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(FriendLink record);

    int updateByPrimaryKey(FriendLink record);

    List<FriendLink> getLinkList();
}