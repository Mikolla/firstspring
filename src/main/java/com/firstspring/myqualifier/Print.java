package com.firstspring.myqualifier;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class Print {

    @Autowired
    @Qualifier("circle")
    private Figure figure;

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public void showSquare() {
        System.out.println("Square of " + this.figure.getName() + " is " + this.figure.square());
    }

}
