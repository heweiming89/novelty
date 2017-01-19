package cn.heweiming.novelty.config;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.number.NumberFormatAnnotationFormatterFactory;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.util.UrlPathHelper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

import cn.heweiming.novelty.controller.converter.EnumConverter;
import cn.heweiming.novelty.controller.converter.NoveltyStringToBigDecimalConverter;
import cn.heweiming.novelty.controller.converter.PersonConverter;
import cn.heweiming.novelty.json.deserializer.BigDecimalDeserializer;

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

	@Bean /* 文件上传配置 */
	public MultipartResolver multipartResolver() {
		StandardServletMultipartResolver multipartResolver = new StandardServletMultipartResolver();
		return multipartResolver;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// configurer.enable(); // 配置静态资源的处理
		configurer.enable("noveltyDefaultServlet");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// registry.addInterceptor(new TimeBasedAccessInterceptor());
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(new PersonConverter());
		registry.addConverter(new EnumConverter());
		registry.addFormatterForFieldAnnotation(new NumberFormatAnnotationFormatterFactory());

		registry.addConverter(new NoveltyStringToBigDecimalConverter());
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

		Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
		builder.indentOutput(true).dateFormat(new SimpleDateFormat("yyyy-MM-dd"))
				.modulesToInstall(new ParameterNamesModule());
		builder.serializationInclusion(JsonInclude.Include.NON_NULL);

		Map<Class<?>, JsonDeserializer<?>> deserializers = new LinkedHashMap<>();
		deserializers.put(BigDecimal.class, new BigDecimalDeserializer());
		builder.deserializersByType(deserializers);

		// Jackson2ObjectMapperBuilder builder = new
		// Jackson2ObjectMapperBuilder()//
		// .indentOutput(true)//
		// .dateFormat(new SimpleDateFormat("yyyy-MM-dd"));
		// converters.add(new
		// MappingJackson2HttpMessageConverter(builder.build()));
		// converters.add(new
		// MappingJackson2XmlHttpMessageConverter(builder.xml().build()));

		// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		// ObjectMapper mapper = new ObjectMapper();
		// mapper.setDateFormat(dateFormat);
		// mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

		MappingJackson2HttpMessageConverter jsonHmc = new MappingJackson2HttpMessageConverter();
		jsonHmc.setSupportedMediaTypes(
				Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON_UTF8, MediaType.TEXT_HTML));
		jsonHmc.setObjectMapper(builder.build());
		converters.add(jsonHmc);

		// XmlMapper xmlMapper = new XmlMapper();
		// xmlMapper.setDateFormat(dateFormat);
		// xmlMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

		MappingJackson2XmlHttpMessageConverter xmlHmc = new MappingJackson2XmlHttpMessageConverter();
		xmlHmc.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_XML, MediaType.APPLICATION_ATOM_XML,
				MediaType.APPLICATION_XHTML_XML, MediaType.TEXT_XML));
		xmlHmc.setObjectMapper(builder.createXmlMapper(Boolean.TRUE).build());
		converters.add(xmlHmc);
	}

	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		UrlPathHelper urlPathHelper = new UrlPathHelper();
		urlPathHelper.setRemoveSemicolonContent(false);
		configurer.setUrlPathHelper(urlPathHelper);
	}

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer.mediaType("json", MediaType.APPLICATION_JSON);
		configurer.mediaType("xml", MediaType.APPLICATION_XML);
	}

	// @Bean
	// public RequestHandlerFilter requestHandlerFilter(){
	// return new RequestHandlerFilter();
	// }

}
