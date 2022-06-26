package com.student.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class StudentAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] configFiles={StudentAppConfig.class};
        return configFiles;
    }
    @Override
    protected String[] getServletMappings() {
        String[] mappings = {"/"};
        return mappings;
    }
}