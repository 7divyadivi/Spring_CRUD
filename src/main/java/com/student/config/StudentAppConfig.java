package com.student.config;
import com.student.DAO.StudentDAO;
import com.student.DAO.StudentImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.student"})
public class StudentAppConfig {
    @Bean
    public InternalResourceViewResolver viewResource() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    @Bean
    public StudentImplementation studentImplementation()
    {
        StudentImplementation studentImplementation = new StudentImplementation();
        return studentImplementation;
    }
    @Bean
    public JdbcTemplate jdbcTemplate()
    {
        JdbcTemplate jdbcTemplate =new JdbcTemplate(dataSource());
        return jdbcTemplate;
    }
    @Bean
    public DataSource dataSource()
    {
        DriverManagerDataSource dataSource =new DriverManagerDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("Cei123**");
        dataSource.setUrl("jdbc:mysql://localhost:3306/cei?useSSL=false");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }
    @Bean
    public StudentDAO studentDAO()
    {
        StudentDAO studentDAO=new StudentImplementation();
        return studentDAO;
    }
}