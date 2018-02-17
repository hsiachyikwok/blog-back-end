package com.hsia.blog.api;

import com.hsia.blog.entity.Navigation;

import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:35
 * @Description:
 */
public interface INavService {
    /**
     * 新增导航
     * @param navigation
     */
    void addNav(Navigation navigation);

    /**
     * 更新导航
     * @param navigation
     */
    void updateTag(Navigation navigation);

    /**
     * 查询导航
     * @return
     */
    List<Navigation> listNav();

    /**
     * 删除导航
     * @param id
     */
    void deleteNav(String id);
}
