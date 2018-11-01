package com.firstspring.myqualifier;

public abstract class Figure {
    private String name;

    public Figure() {
    }

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract double square();
}