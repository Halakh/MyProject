package week4exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BackshoppingApplication {
    public static void main(String[] args) {
        //Create an empty groceries list and display it.
        List<String> groceries = new ArrayList<>();

        System.out.println("The list is :"+ groceries);
        //Create three Strings that represent three different groceries.

        //Add them to the groceries list and display it.
        String onions = "onions";
        String tomatoes = "tomatoes";
        String lemons = "lemons";
        groceries.add(onions);
        groceries.add(tomatoes);
        groceries.add(lemons);
        System.out.println("The editedList is :"+ groceries);

        //Remove one of them by providing
        // its name as an argument and display the list.
        groceries.remove(lemons);
        System.out.println("The newList is :"+ groceries);

        //Add one of the existing groceries twice and display the list.
        groceries.add(tomatoes);
        System.out.println("The newList is :"+ groceries);

        //Remove the third element of the list by
        // providing its position and display it.
        groceries.remove(2);
        System.out.println("The newList is :"+ groceries);
        System.out.println("The newList size is :"+ groceries.size());



    }




}
