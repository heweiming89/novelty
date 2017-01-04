package cn.heweiming.novelty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	
	/*
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		// String profile = "prod";
		// servletContext.setInitParameter("spring.profiles.default", profile);

		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(SpringFrameworkConfig.class);
		webApplicationContext.setServletContext(servletContext);

		// 中文乱码
		FilterRegistration.Dynamic characterEncodingFilter = servletContext.addFilter("characterEncodingFilter",
				CharacterEncodingFilter.class);
		characterEncodingFilter.setInitParameter("encoding", "UTF-8");
		characterEncodingFilter.setInitParameter("forceEncoding", "true");
		characterEncodingFilter.addMappingForUrlPatterns(null, false, "/*");

		// REST
		FilterRegistration.Dynamic hiddenHttpMethodFilter = servletContext.addFilter("hiddenHttpMethodFilter",
				HiddenHttpMethodFilter.class);
		hiddenHttpMethodFilter.addMappingForUrlPatterns(null, false, "/*");

		System.out.println("222222222222222222222");

		ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("dispatcherServlet",
				new DispatcherServlet(webApplicationContext));
		dispatcherServlet.addMapping("/");
		dispatcherServlet.setLoadOnStartup(1);

		// Collection<JspPropertyGroupDescriptor> jspPropertyGroups = new
		// ArrayList<>();
		// Collection<TaglibDescriptor> taglibs = new ArrayList<>();
		// JspPropertyGroupDescriptor fds = new
		// JspPropertyGroupDescriptorImpl(null);
		//
		//
		// JspConfigDescriptor jspConfigDescriptor = new
		// JspConfigDescriptorImpl(jspPropertyGroups,taglibs);
		// JspConfigDescriptor descriptor =
		// servletContext.getJspConfigDescriptor();
		// descriptor = jspConfigDescriptor;

		// JspPropertyGroupDescriptor e = new
		// JspPropertyGroupDescriptorImpl(jspPropertyGroups);
		// jspPropertyGroups.add(e )

		// javax.servlet.ServletRegistration.Dynamic rainServlet =
		// servletContext.addServlet("rainServlet", RainServlet.class);
		// rainServlet.addMapping("/rain");

		// AnnotationConfigWebApplicationContext ctx = new
		// AnnotationConfigWebApplicationContext();
		// ctx.register(SpringMvcConfig.class);
		// ctx.setServletContext(servletContext);
		//
		// ServletRegistration.Dynamic dispatcherServlet =
		// servletContext.addServlet("dispatcherServlet", new
		// DispatcherServlet(ctx));
		//
		// dispatcherServlet.setLoadOnStartup(1);
		// dispatcherServlet.addMapping("/");

		// servletContext.set
	}
	*/

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}
