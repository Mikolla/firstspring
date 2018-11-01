package com.firstspring.myqualifier;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Circle extends Figure {
    private int radius;
    public static double PI = 3.1415;
    private String name;

    @Autowired
    public Circle(@Value("circle") String name, @Value("5") int radius) {
        super(name);
        this.radius = radius;
    }

    public double square() {
        return PI*this.radius*this.radius;
    }
}
