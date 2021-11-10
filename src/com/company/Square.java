package com.company;

public class Square extends Shape {

    public Square(Colour colour) {
        super(colour);
    }

    public String draw() {
        return colour.fill() + " square created.";
    }
}