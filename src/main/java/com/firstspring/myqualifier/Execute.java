package com.firstspring.myqualifier;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {
    public static void main(String [] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Print print = (Print) context.getBean("print");
        print.showSquare();
    }
}
