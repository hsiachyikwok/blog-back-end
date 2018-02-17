package com.hsia.blog.api;

import com.hsia.blog.entity.FriendLink;

import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:35
 * @Description:
 */
public interface IFriendLinkService {
    /**
     * 新增友链
     * @param friendLink
     */
    void addFriendLink(FriendLink friendLink);

    /**
     * 更新友链
     * @param friendLink
     */
    void updateFriendLink(FriendLink friendLink);

    /**
     * 查询友链
     * @return
     */
    List<FriendLink> listFriendLink();

    /**
     * 删除友链
     * @param id
     */
    void deleteFriendLink(String id);
}
