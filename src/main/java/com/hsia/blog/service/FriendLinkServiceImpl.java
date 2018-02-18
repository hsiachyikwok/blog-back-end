package com.hsia.blog.service;

import com.hsia.blog.api.IFriendLinkService;
import com.hsia.blog.entity.FriendLink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:40
 * @Description:
 */
@Slf4j
@Service
public class FriendLinkServiceImpl implements IFriendLinkService {
    @Override
    @Transactional
    public void addFriendLink(FriendLink friendLink) {

    }

    @Override
    @Transactional
    public void updateFriendLink(FriendLink friendLink) {

    }

    @Override
    public List<FriendLink> listFriendLink() {
        return null;
    }

    @Override
    @Transactional
    public void deleteFriendLink(String id) {

    }
}
