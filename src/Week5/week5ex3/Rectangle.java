package week5ex3;

import week5ex1.Shape;

public class Rectangle implements Colored, Shape {
    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public String toString() {
        return getColor()+" " +getName();
    }

    @Override
    public String getColor() {
        return "violet";
    }
}
//Create the Rectangle class that implements the
// Colored interface. Implement the getColor method
// with the help of Intellij.
// Return the color of your choice in that method.
//Add the Shape interface to the Rectangle class.
// Don’t replace Colored. Just place a comma after
// Colored and add Shape right afterwards.
// Implement the getName method with the help of Intellij.
// Return the word rectangle in that method.
// Reuse the Shape interface from exercise 1.
