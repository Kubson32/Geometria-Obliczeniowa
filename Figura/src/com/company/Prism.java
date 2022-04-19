package com.company;

public class Prism extends Figure{
    private double h;
    Figure f;

    public Prism(double h, Figure f) {
        this.h = h;
        this.f = f;
    }

    public Prism(double h) {
        this.h = h;
    }

    public Prism() {

    }

    double calculateCapacity() {
        return f.calculateArea()*h;
    }

    @Override
    double calculateArea() {
        return f.calculatePerimeter()*h+2*f.calculateArea();//Pole wzor
    }

    @Override
    double calculatePerimeter() {
        return f.calculatePerimeter()+4*h;
    }
}
