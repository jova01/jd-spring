package com.main.configs;

import com.main.interfaces.ExtraSessions;
import com.main.services.Java;
import com.main.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.main")
@PropertySource("classpath:application.properties")
public class MainAppConfig {

    /*

    @Bean
    public Java java(){
        return new Java(extraSessions());
    }
    @Bean
    public Selenium selenium(){
        return new Selenium();
    }


    @Bean
    public ExtraSessions extraSessions(){
        return new OfficeHours();
    }

     */
}
