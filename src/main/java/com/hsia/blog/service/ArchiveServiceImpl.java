package com.hsia.blog.service;

import com.hsia.blog.api.IArchiveService;
import com.hsia.blog.entity.Archive;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:42
 * @Description:
 */
@Service
@Slf4j
public class ArchiveServiceImpl implements IArchiveService{
    @Override
    public void addArchive(Archive archive) {

    }

    @Override
    public void updateArchive(Archive archive) {

    }

    @Override
    public List<Archive> listArchive() {
        return null;
    }

    @Override
    public void deleteArchive(String id) {

    }
}
