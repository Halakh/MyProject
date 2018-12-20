package week5ex1;

public class Circle implements Shape {

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public String getName() {
        return "Circle";
    }
}

//Create the Circle class that implements the Shape interface.
// Implement the getName method with the help of Intellij.
// Return the word circle in that method.
