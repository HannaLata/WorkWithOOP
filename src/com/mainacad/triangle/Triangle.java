package com.mainacad.triangle;

public class Triangle {

    private double base;
    private double side;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side*base/2;
    }
}
