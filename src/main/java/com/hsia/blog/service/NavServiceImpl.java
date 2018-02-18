package com.hsia.blog.service;

import com.hsia.blog.api.INavService;
import com.hsia.blog.entity.Navigation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public void addNav(Navigation navigation) {

    }

    @Override
    @Transactional
    public void updateNav(Navigation navigation) {

    }

    @Override
    public List<Navigation> listNav() {
        return null;
    }

    @Override
    @Transactional
    public void deleteNav(String id) {

    }
}
