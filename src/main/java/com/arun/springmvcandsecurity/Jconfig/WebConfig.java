package com.arun.springmvcandsecurity.Jconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.arun", scopedProxy = ScopedProxyMode.DEFAULT)
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     *
     * @param configurer
     * To create a view Resolver, we need internal view resolver.
     */

    /*public ViewResolver getViewResolver(){


    }*/

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        super.configureDefaultServletHandling(configurer);
    }
}
