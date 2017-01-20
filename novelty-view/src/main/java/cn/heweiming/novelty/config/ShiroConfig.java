package cn.heweiming.novelty.config;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

import cn.heweiming.novelty.shiro.realm.NoveltyRealm;

@Configuration
public class ShiroConfig {

	/**
	 * shiro缓存管理器; 需要注入对应的其它的实体类中： 1、安全管理器：securityManager
	 * 可见securityManager是整个shiro的核心；
	 * 
	 * @return
	 */
	// @Bean
	// public EhCacheManager ehCacheManager() {
	// EhCacheManager cacheManager = new EhCacheManager();
	// cacheManager.setCacheManagerConfigFile("classpath:config/ehcache-shiro.xml");
	// return cacheManager;
	// }

	/**
	 * Define the realm you want to use to connect to your back-end security
	 * datasource:
	 * 
	 * @return
	 */
	@Bean(name = "shiroRealm")
	public NoveltyRealm noveltyRealm() {
		return new NoveltyRealm();
	}

	/**
	 * 安全管理器
	 * 
	 * @return
	 */
	@Bean(name = "securityManager")
	public DefaultWebSecurityManager securityManager() {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(noveltyRealm());
		return securityManager;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	@Bean(name = "shiroFilter")
	public ShiroFilterFactoryBean shiroFilter() throws Exception {
		ShiroFilterFactoryBean factory = new ShiroFilterFactoryBean();
		factory.setSecurityManager(securityManager());
		String loginUrl = "/admin/login";
		String successUrl = "/index";
		String unauthorizedUrl = "/unauthorized";
		factory.setLoginUrl(loginUrl);
		factory.setSuccessUrl(successUrl);
		factory.setUnauthorizedUrl(unauthorizedUrl);

		Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
		// group1
		// filterChainDefinitionMap.put("/**", "anon");

		// group2
		filterChainDefinitionMap.put("/admin/login", "anon");
		filterChainDefinitionMap.put("/webjars/**", "anon");
		filterChainDefinitionMap.put("/resources/**", "anon");
		filterChainDefinitionMap.put("/**", "authc");

		factory.setFilterChainDefinitionMap(filterChainDefinitionMap);

		return factory;
	}

	/**
	 * 相当于调用SecurityUtils.setSecurityManager(securityManager)
	 * 
	 * @return
	 */
	@Bean
	public MethodInvokingFactoryBean methodInvokingFactoryBean() {
		MethodInvokingFactoryBean factory = new MethodInvokingFactoryBean();
		String staticMethod = "org.apache.shiro.SecurityUtils.setSecurityManager";
		factory.setStaticMethod(staticMethod);
		factory.setArguments(new Object[] { securityManager() });
		return factory;
	}

	/**
	 * Shiro生命周期处理器
	 * 
	 * @return
	 */
	@Bean
	public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
		return new LifecycleBeanPostProcessor();
	}

}
