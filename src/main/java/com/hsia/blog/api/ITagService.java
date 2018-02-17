package com.hsia.blog.api;

import com.hsia.blog.entity.Tag;

import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:34
 * @Description:
 */
public interface ITagService {
    /**
     * 新增标签
     * @param tag
     */
    void addTag(Tag tag);

    /**
     * 更新标签
     * @param tag
     */
    void updateTag(Tag tag);

    /**
     * 查询标签
     * @return
     */
    List<Tag> listTag();

    /**
     * 删除标签
     * @param id
     */
    void deleteTag(String id);
}
