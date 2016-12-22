package cn.heweiming.novelty.config;

import java.util.concurrent.Executor;

import javax.sql.DataSource;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource(value = { "classpath:db.properties" })
@ComponentScan(basePackages = { "cn.heweiming.novelty" }, excludeFilters = {
		@Filter(type = FilterType.ANNOTATION, value = org.springframework.stereotype.Controller.class),
		@Filter(type = FilterType.ANNOTATION, value = org.springframework.web.bind.annotation.RestController.class),
		@Filter(type = FilterType.ANNOTATION, value = org.springframework.web.bind.annotation.ControllerAdvice.class)
 })
// @EnableAutoConfiguration
 @EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
// @EnableAspectJAutoProxy
@EnableAsync
// @EnableScheduling
public class SpringFrameworkConfig implements AsyncConfigurer {

	@Autowired
	Environment env;

	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(10);
		taskExecutor.setMaxPoolSize(20);
		taskExecutor.setQueueCapacity(30);
		taskExecutor.initialize();
		return taskExecutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}

	@Bean
	public DataSource dataSource() {
		// BasicDataSource dataSource = new BasicDataSource();
		// dataSource.setDriverClassName(env.getProperty("jdbc.driver"));
		// dataSource.setUrl(env.getProperty("jdbc.url"));
		// dataSource.setUsername(env.getProperty("jdbc.username"));
		// dataSource.setPassword("");
		// dataSource.setInitialSize(10);
		// dataSource.setMaxIdle(5);
		
		
		
		DataSource build = DataSourceBuilder.create()//
				.driverClassName(env.getProperty("jdbc.driver"))//
				.url(env.getProperty("jdbc.url"))//
				.username(env.getProperty("jdbc.username"))//
				.password("")//
				.build();
		return build;
	}

	// @Bean(name = "sqlSessionFactory")
	// public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource)
	// throws Exception {
	// SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
	// factoryBean.setDataSource(dataSource);
	// ResourcePatternResolver resolver = new
	// PathMatchingResourcePatternResolver();
	// factoryBean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
	// factoryBean.setConfigLocation(resolver.getResource("classpath:mybatis-config.xml"));
	// return factoryBean.getObject();
	// }

	// @Bean
	// public MapperScannerConfigurer mapperScannerConfigurer() {
	// MapperScannerConfigurer mapperScannerConfigurer = new
	// MapperScannerConfigurer();
	// mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
	// mapperScannerConfigurer.setBasePackage("cn.heweiming.up.mapper");
	// return mapperScannerConfigurer;
	// }

	// @Bean
	// public PlatformTransactionManager transactionManager(DataSource
	// dataSource) {
	// return new DataSourceTransactionManager(dataSource);
	// }

}
