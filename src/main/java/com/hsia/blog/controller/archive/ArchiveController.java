package com.hsia.blog.controller.archive;

import com.hsia.blog.api.IArchiveService;
import com.hsia.blog.entity.Archive;
import com.hsia.blog.entity.Article;
import com.hsia.blog.vo.ResponseVo;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: hsia
 * @Date: 2018/1/31 上午10:29
 * @Description:
 */
@Api("归档接口")
@RestController
@RequestMapping("/archive")
@Slf4j
public class ArchiveController {
    @Autowired
    private IArchiveService archiveService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseVo addArchive(@ModelAttribute Archive archive) {
        archiveService.addArchive(archive);
        return new ResponseVo();
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseVo updateArchive(@ModelAttribute Archive archive) {
        archiveService.updateArchive(archive);
        return new ResponseVo();
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseVo listArchive() {
        ResponseVo vo = new ResponseVo();
        vo.setBody(archiveService.listArchive());
        return vo;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseVo deleteArchive(@PathVariable String id) {
        archiveService.deleteArchive(id);
        return new ResponseVo();
    }
}
