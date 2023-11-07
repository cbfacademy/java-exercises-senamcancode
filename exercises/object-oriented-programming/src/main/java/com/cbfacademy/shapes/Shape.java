package com.cbfacademy.shapes;

public abstract class Shape {
    protected String shapeName;

    public String toString() {
        return this.shapeName;

    }

    protected abstract double area();

}