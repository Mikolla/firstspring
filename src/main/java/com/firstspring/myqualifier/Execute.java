package com.firstspring.myqualifier;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Execute {
    public static void main(String [] args) {
       // ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        AnnotationConfigApplicationContext  context2 = new AnnotationConfigApplicationContext();
        context2.scan("com.firstspring.myqualifier");
        context2.refresh();

        Print print = (Print) context2.getBean("print");
        print.showSquare();
    }
}
