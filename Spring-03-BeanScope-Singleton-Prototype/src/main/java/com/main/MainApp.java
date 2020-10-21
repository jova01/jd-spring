package com.main;

import com.main.interfaces.Course;
import com.main.services.Java;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext container= new ClassPathXmlApplicationContext("config.xml");

        Course java1 = container.getBean("java", Course.class);
        Course java2 = container.getBean("java", Course.class);

        System.out.println("Pointing to the same object:" + (java1==java2));
        System.out.println("Momory location for the java1: " +java1);
        ((Java) (java1)).hours=20;
        System.out.println("Momory location for the java2: " +java2);
        java1.getTeachingHours();
        java2.getTeachingHours();
    }
}
