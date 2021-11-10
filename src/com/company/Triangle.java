package com.company;

public class Triangle extends Shape{

    public Triangle(Colour colour) {
        super(colour);
    }

    public String draw() {
        return colour.fill() + " triangle created.";
    }
}
