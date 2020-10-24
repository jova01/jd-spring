package com.main;

import com.main.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext container= new ClassPathXmlApplicationContext("config.xml");

        Course java = container.getBean("javA", Course.class);
        java.getTeachingHours();

        Course api = container.getBean("API", Course.class);
        api.getTeachingHours();
    }
}
