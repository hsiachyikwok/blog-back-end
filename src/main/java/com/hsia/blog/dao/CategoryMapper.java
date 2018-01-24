package com.hsia.blog.dao;

import com.hsia.blog.entity.Category;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: hsia
 * @Date: 2018/1/24 下午4:14
 * @Description:
 */
@Mapper
public interface CategoryMapper {

    @Insert("insert into category (id, cat_name,cat_desc,create_time,update_time) VALUES(#{id}, #{catName},#{catDesc},#{createTime},#{updateTime})")
    int insert(Category category);

}
