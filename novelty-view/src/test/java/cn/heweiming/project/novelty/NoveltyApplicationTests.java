package cn.heweiming.project.novelty;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NoveltyApplicationTests {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(NoveltyApplicationTests.class);

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private StringRedisTemplate template;

	@Test
	public void contextLoads() {
		logger.info("dataSource == {}", dataSource);

		if (logger.isInfoEnabled()) {
			logger.info("contextLoads() - template={}", template); //$NON-NLS-1$
		}
	}
	
	@Test
	public void springApplicationBuilder(){
		Class<?> sources = null;
//		new SpringApplicationBuilder().sources(sources ).
	}
	

}
