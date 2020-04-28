package com.FirstJavaProject.Objects;

public class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return (this.base * this.height) / 2;
    }
}
