package com.FirstJavaProject.Objects;

public class Triangle extends Shape {
    public double base;
    public double height;

    public double area() {
        return (this.base * this.height) / 2;
    }
}
