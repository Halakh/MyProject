package week5ex3;

import week5ex1.Shape;

import java.util.ArrayList;
import java.util.List;

public class BasicColorApplication {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Color:" + rectangle.getColor());
        System.out.println("Name: "+ rectangle.getName());
        //this is called casting; the rectangle is not a shape,
        // it is a colored object
        Colored colored= (Colored) rectangle;
        System.out.println("Colored: " + colored.getColor());
        // This is called casting. Now the rectangle is
        // no longer a Rectangle, but it is a Shape object.
        Shape shape = (Shape) rectangle;
        System.out.println("Shape: "+ shape.getName());
        List<Rectangle>rectangles = new ArrayList<>();
        rectangles.add(rectangle);
        System.out.println(rectangles);

        List<Colored>coloreds = new ArrayList<>();
        coloreds.add(rectangle);
        coloreds.add(colored);
        System.out.println(coloreds);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(shape);
        shapes.add(rectangle);
        System.out.println(shapes);




    }

}
//Create a Rectangle as a normal Rectangle,
// name it rectangle and display its color.
//Add the Shape interface to the Rectangle class.
// Don’t replace Colored.
// Just place a comma after Colored and
// add Shape right afterwards.
// Implement the getName method with the help of Intellij.
// Return the word rectangle in that method.
// Reuse the Shape interface from exercise 1.
//Display the rectangle’s name.
//In a new line, write the following:
// Colored colored = (Colored) rectangle;
// This is called casting. Now the rectangle is
// no longer a Rectangle, but it is a Colored object.
// Display its color. Note that you cannot see any more
// the getName method because the Colored interface does not have it.
//In a new line, write the following:
// Shape shape = (Shape) rectangle;
// This is called casting. Now the rectangle is
// no longer a Rectangle, but it is a Shape object.
// Display its name. Note that you cannot see any more the
// getColor method because the Shape interface does not have it.