package cn.heweiming.novelty.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc // 启用 Spring MVC
@ComponentScan(basePackages = { "cn.heweiming.novelty" }, useDefaultFilters = false, includeFilters = {
		@Filter(type = FilterType.ANNOTATION, value = org.springframework.stereotype.Controller.class),
		@Filter(type = FilterType.ANNOTATION, value = org.springframework.web.bind.annotation.RestController.class),
		@Filter(type = FilterType.ANNOTATION, value = org.springframework.web.bind.annotation.ControllerAdvice.class) })
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		String prefix = "/WEB-INF/classes/views/";
		prefix = "/WEB-INF/views/";
		viewResolver.setPrefix(prefix);
		viewResolver.setSuffix(".jsp");
		viewResolver.setExposeContextBeansAsAttributes(Boolean.TRUE);
		return viewResolver;
	}

	// @Bean
	// public MessageConverter messageConverter(){
	//
	// return null;
	// }

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable(); // 配置静态资源的处理
	}

	// @Override
	// public void addResourceHandlers(ResourceHandlerRegistry registry) {
	// registry.
	// super.addResourceHandlers(registry);
	// }

	@Bean /* 文件上传配置 */
	public MultipartResolver multipartResolver() {
		// StandardServletMultipartResolver resolver = new
		// StandardServletMultipartResolver();
		return new StandardServletMultipartResolver();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// super.addInterceptors(registry);
	}

}
