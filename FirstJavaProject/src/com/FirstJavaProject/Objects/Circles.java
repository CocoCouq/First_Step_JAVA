package com.FirstJavaProject.Objects;

public class Circles {
    // Class variables
    final static double PI=3.1416;
    private float radius;

    public Circles(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    // Circumference
    public double circum() {
        return 2 * PI * this.radius;
    }

    // Surface
    public double surface() {
        return PI * Math.pow(this.radius, 2);
    }

}
