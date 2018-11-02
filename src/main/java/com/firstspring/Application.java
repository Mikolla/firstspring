package com.firstspring;

import com.firstspring.myqualifier.Print;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext();
        context2.scan("com.firstspring.myqualifier");
        context2.refresh();

        Print print = (Print) context2.getBean("print");
        print.showSquare();
    }

}