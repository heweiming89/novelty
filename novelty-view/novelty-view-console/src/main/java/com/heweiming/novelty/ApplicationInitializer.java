package com.heweiming.novelty;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FrameworkServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.heweiming.novelty.config.AppContextConfig;
import com.heweiming.novelty.config.WebContextConfig;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppContextConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebContextConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        boolean done = registration.setInitParameter("throwExceptionIfNoHandlerFound", "true"); // -> true
        if (!done) {
            throw new RuntimeException();
        }
    }

    @Override
    protected FrameworkServlet createDispatcherServlet(WebApplicationContext servletAppContext) {
        DispatcherServlet dispatcherServlet = new DispatcherServlet(servletAppContext);
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(Boolean.TRUE);
        return dispatcherServlet;
    }

    @Override
    protected Filter[] getServletFilters() {
        return new Filter[] {};
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);

        // Rest
        FilterRegistration.Dynamic hiddenHttpMethodFilter = servletContext
                .addFilter("hiddenHttpMethodFilter", new HiddenHttpMethodFilter());
        hiddenHttpMethodFilter.addMappingForUrlPatterns(null, false, "/*");

        // 中文乱码
        FilterRegistration.Dynamic characterEncodingFilter = servletContext
                .addFilter("characterEncodingFilter", CharacterEncodingFilter.class);
        characterEncodingFilter.setInitParameter("encoding", "UTF-8");
        characterEncodingFilter.setInitParameter("forceEncoding", "true");
        characterEncodingFilter.addMappingForUrlPatterns(null, false, "/*");

        // shiro
        //        DelegatingFilterProxy shiroFilterProxy = new DelegatingFilterProxy("shiroFilter");
        //        shiroFilterProxy.setTargetFilterLifecycle(true);
        //        FilterRegistration.Dynamic shiroFilter = servletContext.addFilter("shiroFilter",
        //                shiroFilterProxy);
        //        shiroFilter.addMappingForUrlPatterns(null, false, "/*");

    }

}
