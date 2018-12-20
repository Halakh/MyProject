package week5ex2;

import week5ex1.Shape;

public class Triangle implements Shape {
    @Override
    public String toString() {
        return "Triangle{}";
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}

//Create the Triangle class that implements the Shape interface.
// Implement the getName method with the help of Intellij.
// Return the word triangle in that method.
// Reuse the Shape interface from exercise 1.
