package com.main;

import com.main.config.MainConfig;
import com.main.interfaces.Course;
import com.main.services.Java;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(MainConfig.class);
        Course java= container.getBean("java", Java.class);
        java.getTeachingHours();
        container.close();

    }
}
