package com.hsia.blog.api;

import com.hsia.blog.entity.Archive;

import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:37
 * @Description:
 */
public interface IArchiveService {

    /**
     * 新增归档
     * @param archive
     */
    void addArchive(Archive archive);

    /**
     * 更新归档
     * @param archive
     */
    void updateArchive(Archive archive);

    /**
     * 查询归档
     * @return
     */
    List<Archive> listArchive(int pageNum,int pageSize);

    /**
     * 删除归档
     * @param id
     */
    void deleteArchive(String id);
}
