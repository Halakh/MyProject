package week4exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdvancedShoppingApplication {
    public static void main(String[] args) {
        List<Grocery> groceries = new ArrayList<>();

        Grocery grocery1  = new Grocery("onions");
        Grocery grocery2 = new Grocery("cucumber");
        Grocery grocery3 = new Grocery("lettuce");

        groceries.addAll(Arrays.asList(grocery1,grocery2,grocery3));
        System.out.println("Groceries" + groceries);

        //Create a new Grocery with the same name as a previous
        // one and use it to remove the original one from the list.
        // To remove a Grocery automatically you need to create
        // the equals method in the Grocery class.
        // Specify that two Grocery are the same if their name
        // is the same.
        Grocery grocery4= new Grocery("cucumber");
        groceries.remove(grocery4);
        System.out.println("Groceries:" + groceries);

        Grocery grocery5  = new Grocery("onions");
        groceries.add(grocery5);
        groceries.add(grocery5);
        System.out.println("Groceries: " + groceries);
        groceries.remove(2);
        System.out.println("Groceries: " + groceries);
        System.out.println("Groceries: " + groceries.size());








    }
    

}//Add them to the groceries list and display it.
    // To display the Grocery class create the toString method.
// Create a new Grocery with the same name as a previous one
// and use it to remove the original one from the list.
// To remove a Grocery automatically you need to create
// the equals method in the Grocery class.
// Specify that two Grocery are the same if their name is the same.

