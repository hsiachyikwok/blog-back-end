package com.hsia.blog.service;

import com.github.pagehelper.PageInfo;
import com.hsia.blog.api.IArchiveService;
import com.hsia.blog.entity.Archive;
import com.hsia.blog.mapper.ArchiveMapper;
import com.hsia.blog.mapper.ArticleMapper;
import com.hsia.blog.vo.ArchiveVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:42
 * @Description:
 */
@Service
@Slf4j
public class ArchiveServiceImpl implements IArchiveService {

    @Resource
    private ArchiveMapper archiveMapper;

    @Override
    @Transactional
    public void addArchive(Archive archive) {

    }

    @Override
    @Transactional
    public void updateArchive(Archive archive) {

    }

    @Override
    public Object listArchive(int pageNum,int pageSize) {
        List<Archive> archives = archiveMapper.getArchiveList(pageNum,pageSize);
        PageInfo<Archive> pageInfo = new PageInfo(archives);
        return pageInfo;
    }

    @Override
    @Transactional
    public void deleteArchive(String id) {

    }
}
