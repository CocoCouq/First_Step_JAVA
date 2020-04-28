package com.FirstJavaProject.Objects;

public abstract class Vehicles {
    private String start;

    public Vehicles(String start) {
        this.start = start;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void moving() {
        System.out.println(this.start);
    }
}
