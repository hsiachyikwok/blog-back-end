package com.hsia.blog.service;

import com.hsia.blog.api.INavService;
import com.hsia.blog.entity.Navigation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:39
 * @Description:
 */
@Slf4j
@Service
public class NavServiceImpl implements INavService{
    @Override
    public void addNav(Navigation navigation) {

    }

    @Override
    public void updateTag(Navigation navigation) {

    }

    @Override
    public List<Navigation> listNav() {
        return null;
    }

    @Override
    public void deleteNav(String id) {

    }
}
