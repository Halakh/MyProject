package week5ex2;

import week5ex1.Circle;
import week5ex1.Shape;

import java.util.ArrayList;
import java.util.List;

public class BasicShapesApplication {
    public static void main(String[] args) {
        //Create a Circle as a Shape,
        Shape circle = new Circle();
        System.out.println("Shape: " + circle.getName());

        //Create a Square as a Shape,
        // name it square and display its name.
        Shape square = new Square();
        System.out.println("Shape: "+ square.getName());

        //Create a Triangle as a Shape,
        // name it triangle and display its name.
        Shape triangle = new Triangle();

        //Create a list of Circle named circles
        // and try to add circle, square and triangle to it.
        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);
        System.out.println("Shapes: "+ shapes);
        // we cant use shape alone! we have to use Shape shape

        for (Shape shape : shapes) {
            System.out.println("Shape name: " + shape.getName());

        }
    }

}

 //It doesn’t work because circle is not a Circle now, it is a Shape, and it’s not the same. Also, square and triangle don’t work either because they are not Circles.
//Create a list of Shape named shapes and
// add circle to it. Try to add square
// and triangle as well. It works because
// the three of them are shapes.
//Display the list. It shows memory addresses.
// Implement the toString methods in each one of
// the three Shapes returning the name of the shape
// itself by reusing the interface method.
// Display it now.
//Use a foreach loop to go through all the shapes
// and one by one display its names.
