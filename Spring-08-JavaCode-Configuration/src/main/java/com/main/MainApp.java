package com.main;

import com.main.configs.MainAppConfig;
import com.main.interfaces.Course;
import com.main.services.Java;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(MainAppConfig.class);
        Course java = container.getBean("java", Java.class);
        java.getTeachingHours();
    }
}
