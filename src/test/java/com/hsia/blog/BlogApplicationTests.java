package com.hsia.blog;

import com.hsia.blog.util.PrimaryKeyUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testPrimary() {
		org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());
		String id = PrimaryKeyUtil.generateShortUUID();
		logger.info(id);
	}

}
