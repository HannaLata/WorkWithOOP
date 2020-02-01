package com.mainacad;

import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;

public class ApplicationRunner {

//    static String myName = "Hanna Lata";

    public static void main(String[] args) {

//     System.out.println("My name is " + myName);

        Square square1 = new Square();
        square1.setSide(10.0);

        System.out.println("Square with side " + square1.getSide() + " has area " + square1.getArea());

        Circle circle1 = new Circle();
        circle1.setRadius(10.0);

        System.out.println("Circle with radius " + circle1.getRadius() + " has area " + circle1.getArea());

        Triangle triangle1 = new Triangle();
        triangle1.setBase(10);
        triangle1.setSide(12);

        System.out.println("Triangle with base " + triangle1.getBase() + " and side " + triangle1.getSide() +
                " has area " + triangle1.getArea());


    }


}
