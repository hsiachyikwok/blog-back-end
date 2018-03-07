package com.hsia.blog.mapper;

import com.hsia.blog.entity.Tag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TagMapper {
    int deleteByPrimaryKey(String id);

    int insert(Tag record);

    int insertSelective(Tag record);

    Tag selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Tag record);

    int updateByPrimaryKey(Tag record);

    List<Tag> getTagList();

    Tag selectByTagName(@Param("tagName") String tagName);
}