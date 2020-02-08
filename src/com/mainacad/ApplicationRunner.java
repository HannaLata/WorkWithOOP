package com.mainacad;

import com.mainacad.abs.Shape;
import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;

import java.util.ArrayList;
import java.util.List;

public class ApplicationRunner {

//    static String myName = "Hanna Lata";

    public static void main(String[] args) {

//     System.out.println("My name is " + myName);

        Square square1 = new Square(28.0);
//      square1.setSide(28.0);
//      square1.setName("Square");

        System.out.println("Square with side " + square1.getSide() + " has area " + square1.getArea());

        Circle circle1 = new Circle(10.0);
//      circle1.setRadius(10.0);

        System.out.println("Circle with radius " + circle1.getRadius() + " has area " + circle1.getArea());

        Triangle triangle1 = new Triangle(15.0, 20.0);
        Triangle triangle2 = new Triangle(20.0, 15.0);

        System.out.println(triangle1.equals(triangle2));

//      triangle1.setBase(15);
//      triangle1.setHeight(20);

        System.out.println("Triangle with base " + triangle1.getBase() + " and height " + triangle1.getHeight() +
                " has area " + triangle1.getArea());

        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle1);
        shapes.add(triangle2);
        shapes.add(square1);
        shapes.add(circle1);

        Shape maxShape = shapes.get(0);
        for ( int i = 1; i < shapes.size(); i++) {
            if ( maxShape.getArea() < shapes.get(i).getArea()) {
                maxShape = shapes.get(i);
            }
        }

        Shape minShape = shapes.get(0);
        for ( int i = 1; i < shapes.size(); i++) {
            if ( minShape.getArea() > shapes.get(i).getArea()) {
                minShape = shapes.get(1);
            }
        }

//        Shape maxShape;
//
//        if (circle1.getArea() > square1.getArea()) {
//            maxShape = circle1;
//        } else {
//            maxShape = square1;
//        }
//
//        if (maxShape.getArea() < triangle1.getArea()) {
//            maxShape = triangle1;
//        }
//
          System.out.println("Max shape is " + maxShape.getClass().getSimpleName() + " has area " + maxShape.getArea());
//
//        Shape minShape;
//
//        if (circle1.getArea() < square1.getArea()) {
//            minShape = circle1;
//        } else {
//            minShape = square1;
//        }
//
//        if (minShape.getArea() > triangle1.getArea()) {
//            minShape = triangle1;
//        }

        System.out.println("Min shape is " + minShape.getClass().getSimpleName() + " has area " + minShape.getArea());


    }


}
