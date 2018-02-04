package com.hsia.blog.mapper;

import com.hsia.blog.entity.Signature;

public interface SignatureMapper {
    int deleteByPrimaryKey(String id);

    int insert(Signature record);

    int insertSelective(Signature record);

    Signature selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Signature record);

    int updateByPrimaryKey(Signature record);
}