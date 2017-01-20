package cn.heweiming.novelty.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@Configuration
public class ApplicationConfig {

	/**
	 * 注册DelegatingFilterProxy（Shiro） 集成Shiro有2种方法： 1.
	 * 按这个方法自己组装一个FilterRegistrationBean（这种方法更为灵活，可以自己定义UrlPattern，
	 * 在项目使用中你可能会因为一些很但疼的问题最后采用它， 想使用它你可能需要看官网或者已经很了解Shiro的处理原理了） 2.
	 * 直接使用ShiroFilterFactoryBean（这种方法比较简单，其内部对ShiroFilter做了组装工作，无法自己定义UrlPattern，
	 * 默认拦截 /*）
	 *
	 * @param dispatcherServlet
	 * @return
	 * @author SHANHY
	 * @create 2016年1月13日
	 */
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
		filterRegistration.setFilter(new DelegatingFilterProxy("shiroFilter"));
		// 该值缺省为false,表示生命周期由SpringApplicationContext管理,设置为true则表示由ServletContainer管理
		filterRegistration.addInitParameter("targetFilterLifecycle", "true");
		filterRegistration.setEnabled(true);
		filterRegistration.addUrlPatterns("/*");
		// 可以自己灵活的定义很多，避免一些根本不需要被Shiro处理的请求被包含进来
		return filterRegistration;
	}
	
	@Bean(name = "hiddenHttpMethodFilter")
	public HiddenHttpMethodFilter hiddenHttpMethodFilter(){
		HiddenHttpMethodFilter filter = new  HiddenHttpMethodFilter();
		return filter;
	}
	
	@Bean
	public FilterRegistrationBean hiddenHttpMethodFilterRegistration(){
		FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
//		filterRegistration.setFilter(new  HiddenHttpMethodFilter());
		filterRegistration.setFilter(hiddenHttpMethodFilter());
		filterRegistration.setEnabled(true);
		filterRegistration.addUrlPatterns("/*");
		return filterRegistration;
	}
	
	/*
	 * RegistrationBean
	 * ServletRegistrationBean
	 * ServletListenerRegistrationBean
	 * 
	 */
	
}
