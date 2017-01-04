package cn.heweiming.novelty.config;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.number.NumberFormatAnnotationFormatterFactory;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import org.springframework.web.util.UrlPathHelper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import cn.heweiming.novelty.conversion.EnumConverter;
import cn.heweiming.novelty.conversion.PersonConverter;
import cn.heweiming.novelty.interceptor.TimeBasedAccessInterceptor;

@Configuration
@EnableWebMvc // 启用 Spring MVC
@ComponentScan(basePackages = { "cn.heweiming.novelty" }, useDefaultFilters = false, includeFilters = {
		@Filter(type = FilterType.ANNOTATION, value = org.springframework.stereotype.Controller.class),
		@Filter(type = FilterType.ANNOTATION, value = org.springframework.web.bind.annotation.RestController.class),
		@Filter(type = FilterType.ANNOTATION, value = org.springframework.web.bind.annotation.ControllerAdvice.class) })
public class SpringMvcConfig extends WebMvcConfigurerAdapter {

	
	@Bean
	public ViewResolver viewResolver() { // UrlBasedViewResolver
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		String prefix = "/WEB-INF/classes/views/";
		prefix = "/WEB-INF/views/";
		String suffix = ".jsp";
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix(prefix);
		viewResolver.setSuffix(suffix); 
		viewResolver.setExposeContextBeansAsAttributes(Boolean.TRUE);

		// ContentNegotiatingViewResolver

		return viewResolver;
	}
	

	
	/*
	@Bean
	public ViewResolver viewResolver() {
		ContentNegotiatingViewResolver cnvr = new ContentNegotiatingViewResolver();
		
		List<View> defaultViews = new ArrayList<>();
		MappingJackson2JsonView jsonView = new MappingJackson2JsonView();
		defaultViews.add(jsonView);
		
		cnvr.setDefaultViews(defaultViews);
		
		List<ViewResolver> viewResolvers = new ArrayList<>();
		
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		String prefix = "/WEB-INF/classes/views/";
		prefix = "/WEB-INF/views/";
		String suffix = ".jsp";
		internalResourceViewResolver.setViewClass(JstlView.class);
		internalResourceViewResolver.setPrefix(prefix);
		internalResourceViewResolver.setSuffix(suffix); 
		internalResourceViewResolver.setExposeContextBeansAsAttributes(Boolean.TRUE);
		
		
		
		viewResolvers.add(internalResourceViewResolver);
		
		cnvr.setViewResolvers(viewResolvers);

		return cnvr;
	}
	*/

	@Bean /* 文件上传配置 */
	public MultipartResolver multipartResolver() {
		StandardServletMultipartResolver multipartResolver = new StandardServletMultipartResolver();
		return multipartResolver;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable(); // 配置静态资源的处理
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new TimeBasedAccessInterceptor());
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(new PersonConverter());
		registry.addConverter(new EnumConverter());
		registry.addFormatterForFieldAnnotation(new NumberFormatAnnotationFormatterFactory());
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

		ObjectMapper mapper = new ObjectMapper();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		mapper.setDateFormat(dateFormat);
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

		MappingJackson2HttpMessageConverter jsonHmc = new MappingJackson2HttpMessageConverter();
		jsonHmc.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON_UTF8, MediaType.TEXT_HTML));
		jsonHmc.setObjectMapper(mapper);
		converters.add(jsonHmc);

		XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.setDateFormat(dateFormat);
		xmlMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

		MappingJackson2XmlHttpMessageConverter xmlHmc = new MappingJackson2XmlHttpMessageConverter();
		xmlHmc.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_ATOM_XML, MediaType.TEXT_XML));
		// xmlHmc.setObjectMapper(mapper);
		converters.add(xmlHmc);
	}

	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		UrlPathHelper urlPathHelper = new UrlPathHelper();
		urlPathHelper.setRemoveSemicolonContent(false);
		configurer.setUrlPathHelper(urlPathHelper);
	}

}
