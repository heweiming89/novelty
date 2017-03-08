package cn.heweiming.project.novelty.config;

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
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.util.UrlPathHelper;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer;

import cn.heweiming.project.novelty.property.NoveltyProperties;

@Configuration
@EnableWebMvc // 启用 Spring MVC
@ComponentScan(basePackages = { NoveltyProperties.BASE_PACKAGES }, useDefaultFilters = false, includeFilters = {
        @Filter(type = FilterType.ANNOTATION, value = Controller.class),
        @Filter(type = FilterType.ANNOTATION, value = RestController.class),
        @Filter(type = FilterType.ANNOTATION, value = ControllerAdvice.class) })
public class WebContextConfig extends WebMvcConfigurerAdapter {

    private static final String WEBJARS_PATTERN = "/webjars/**";
    private static final String WEBJARS_LOCATIONS = "classpath:/META-INF/resources/webjars/";
    private static final String STATIC_PATTERN = "/static/**";
    private static final String STATIC_LOCATIONS = "classpath:/static/";

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
        // registry.addInterceptor(new TimeBasedAccessInterceptor());
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {

    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.indentOutput(true)//
                // .modulesToInstall(new ParameterNamesModule())//
                .dateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        // builder.serializationInclusion(JsonInclude.Include.NON_NULL);

        Map<Class<?>, JsonDeserializer<?>> deserializers = new LinkedHashMap<>();
        deserializers.put(BigDecimal.class, new BigDecimalDeserializer());
        builder.deserializersByType(deserializers);

        MappingJackson2HttpMessageConverter jsonHmc = new MappingJackson2HttpMessageConverter();
        jsonHmc.setSupportedMediaTypes(
                Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON_UTF8, MediaType.TEXT_HTML));
        jsonHmc.setObjectMapper(builder.build());
        converters.add(jsonHmc);

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

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!registry.hasMappingForPattern(WEBJARS_PATTERN)) {
            registry.addResourceHandler(WEBJARS_PATTERN).addResourceLocations(WEBJARS_LOCATIONS);
        }
        if (!registry.hasMappingForPattern(STATIC_PATTERN)) {
            registry.addResourceHandler(STATIC_PATTERN).addResourceLocations(STATIC_LOCATIONS);
        }
    }

}
