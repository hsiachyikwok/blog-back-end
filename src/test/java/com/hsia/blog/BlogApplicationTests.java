package com.hsia.blog;

import com.hsia.blog.dao.CategoryMapper;
import com.hsia.blog.entity.Category;
import com.hsia.blog.util.PrimaryKeyUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {
	@Autowired
	private CategoryMapper categoryMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testPrimary() {
		org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());
		String id = PrimaryKeyUtil.generateShortUUID();
		logger.info(id);
	}

	@Test
	public void testMybatis(){
		Category category = new Category();
		category.setId(PrimaryKeyUtil.generateShortUUID());
		category.setCatDesc("test");
		category.setCatName("test");
		category.setCreateTime(new Date());
		category.setUpdateTime(new Date());
		categoryMapper.insert(category);
	}

}
