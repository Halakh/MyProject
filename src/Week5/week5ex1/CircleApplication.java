package week5ex1;

public class CircleApplication {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Class: "+ circle.getName());
        //In a new line, assign the circle variable to
        // a Shape variable called shape.
        //we are asking the circle to be a shape
        Shape shape = circle;
        System.out.println("Shape: " + shape.getName());


        Shape anotherShape = new Circle();
        System.out.println("Another shape: "+anotherShape.getName());



    }

}

// Just use the = symbol.

//Create another Circle, but
// this time assign it directly to a Shape with the name anotherShape.
//Display anotherShape’s name.
