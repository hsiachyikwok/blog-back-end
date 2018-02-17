package com.hsia.blog.service;

import com.hsia.blog.api.ICategoryService;
import com.hsia.blog.entity.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:43
 * @Description:
 */
@Service
@Slf4j
public class CategoryServiceImpl implements ICategoryService {
    @Override
    public void addCategory(Category category) {

    }

    @Override
    public void updateCategory(Category category) {

    }

    @Override
    public List<Category> listCategory() {
        return null;
    }

    @Override
    public void deleteCategory(String id) {

    }
}
