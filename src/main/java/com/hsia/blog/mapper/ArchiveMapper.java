package com.hsia.blog.mapper;

import com.hsia.blog.entity.Archive;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArchiveMapper {
    int deleteByPrimaryKey(String id);

    int insert(Archive record);

    int insertSelective(Archive record);

    Archive selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Archive record);

    int updateByPrimaryKey(Archive record);

    List<Archive> getArchiveList(@Param("pageNum") int pageNum,
                                 @Param("pageSize") int pageSize);
}