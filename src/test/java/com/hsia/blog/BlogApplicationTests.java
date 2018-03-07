package com.hsia.blog;


import com.hsia.blog.entity.Category;
import com.hsia.blog.mapper.CategoryMapper;
import com.hsia.blog.util.PrimaryKeyUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BlogApplicationTests {
    @Resource
    private CategoryMapper categoryMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testPrimary() {
        String id = PrimaryKeyUtil.generateShortUUID();
        log.info(id);
    }

    @Test
    public void testMybatis() {
        Category category = new Category();
        category.setId(PrimaryKeyUtil.generateShortUUID());
        category.setCatDesc("test");
        category.setCatName("test");
        category.setCreateTime(new Date());
        category.setUpdateTime(new Date());
        categoryMapper.insert(category);
    }

    @Test
    public void testSplit() {
        String a = "java,spring,aaa,";
        String[] tags = a.split(",");
        for (int i = 0; i < tags.length; i++) {
            System.out.println(tags[i]);
        }
    }

    @Test
    public void testTime() {
        Date date = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println(dateFormat.parse(dateFormat.format(date)));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

