# SpringMVC

## Steps to configure Spring MVC.

Step 1 : Configure Dispatcher Servlet.
Step 2 : Configure View Resolver.
Step 3 : 


###  Step 1 : Configure Dispatcher Servlet. 
This is the entry point of the 
framework, all the request hits the dispatcher Servlet.

Any class which extends AbstractAnnotationConfigDispatcherServletInitializer
will be automatically be used to configure Dispatcher Servlet. 

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
