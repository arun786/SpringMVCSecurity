package com.arun.springmvcandsecurity.Jconfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Java configuration for configure Dispatcher Servlet
 */
public class WebAppConfigInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * @return ApplicationContext Services can be started here by defining a
     * set of configuration properties in the java class
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    /**
     * @return This defines the servlet mapping
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
