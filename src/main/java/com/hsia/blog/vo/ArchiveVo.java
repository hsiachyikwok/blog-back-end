package com.hsia.blog.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/2/24 下午7:13
 * @Description:
 */
@Data
public class ArchiveVo {

    private Date archiveTime;

    private List<String> articleList;
}
