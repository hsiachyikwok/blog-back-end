package com.hsia.blog;

import com.hsia.blog.dao.CategoryMapper;
import com.hsia.blog.entity.Category;
import com.hsia.blog.util.PrimaryKeyUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BlogApplicationTests {
	@Resource
	private CategoryMapper categoryMapper;

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testPrimary() {
		String id = PrimaryKeyUtil.generateShortUUID();
		log.info(id);
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

	@Test
	public void testSqlSession() throws SQLException {
		Connection connection = sqlSessionFactory.openSession().getConnection();
		DatabaseMetaData metaData = connection.getMetaData();
		ResultSet resultSet = metaData.getColumns(connection.getCatalog(),"%", "article","%");
		String columnName;
		String columnType;
		while(resultSet.next()) {
//　　	columnName = resultSet.getString("COLUMN_NAME");
//　　	columnType = resultSet.getString("TYPE_NAME");
//　　	int datasize = resultSet.getInt("COLUMN_SIZE");
//　　	int digits = resultSet.getInt("DECIMAL_DIGITS");
//　　	int nullable = resultSet.getInt("NULLABLE");
//　　	System.out.println(columnName+" "+columnType+" "+datasize+" "+digits+" "+ nullable);
			columnName = resultSet.getString("COLUMN_NAME");
			columnType = resultSet.getString("TYPE_NAME");
			int datasize = resultSet.getInt("COLUMN_SIZE");
			int digits = resultSet.getInt("DECIMAL_DIGITS");
			int nullable = resultSet.getInt("NULLABLE");
			System.out.println(columnName+" "+columnType+" "+datasize+" "+digits+" "+ nullable);
		}

		log.info("--------------");
		//log.info();
		log.info("--------------");
	}

}
