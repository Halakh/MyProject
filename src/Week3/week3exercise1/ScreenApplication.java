package week3exercise1;

public class ScreenApplication {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Mr. Smith" , "Business");
        Customer customer2 = new Customer("Mrs. Johnson" , "Economic");

        Screen screen = new Screen();
        screen.display(customer1);
        screen.display(customer2);

    }

}
    //In the ScreenApplication class main method,
// create a business class Customer,
// an economic class Customer,
// a Screen and display them the screen.
