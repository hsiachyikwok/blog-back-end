package com.hsia.blog.service;

import com.hsia.blog.api.ITagService;
import com.hsia.blog.entity.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:37
 * @Description:
 */
@Slf4j
@Service
public class TagServiceImpl implements ITagService {
    @Override
    @Transactional
    public void addTag(Tag tag) {

    }

    @Override
    @Transactional
    public void updateTag(Tag tag) {

    }

    @Override
    public List<Tag> listTag() {
        return null;
    }

    @Override
    @Transactional
    public void deleteTag(String id) {

    }
}
