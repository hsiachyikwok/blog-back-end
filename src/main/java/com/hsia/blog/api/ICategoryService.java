package com.hsia.blog.api;

import com.hsia.blog.entity.Category;

import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:33
 * @Description:
 */
public interface ICategoryService {
    /**
     * 增加分类
     * @param category
     */
    void addCategory(Category category);

    /**
     * 更新分类
     * @param category
     */
    void updateCategory(Category category);

    /**
     * 查询分类
     * @return
     */
    List<Category> listCategory();

    /**
     * 删除分类
     * @param id
     */
    void deleteCategory(String id);
}
