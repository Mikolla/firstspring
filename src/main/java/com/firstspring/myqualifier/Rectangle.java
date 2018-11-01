package com.firstspring.myqualifier;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Rectangle extends Figure {
    private int length;
    private int width;
    private String name;

    @Autowired
    public Rectangle(@Value("rectangle") String name, @Value("5") int length, @Value("5") int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double square() {
        return this.length*this.width;
    }
}