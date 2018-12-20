package week4exercise2;

import java.util.HashSet;
import java.util.Set;

public class BasicBackpackApplication {
    public static void main(String[] args) {
        //Create an empty backpack set and display it.
        Set<String> backpackSet = new HashSet<>();
        System.out.println("The Backpack Set is:"+ backpackSet);

        //Create three Strings
        // that represent three different items.

        String blanket= "blanket";
        String pyjamas= "pyjamas";
        String towel= "towel";

        //Add them to the backpack set and display it.
        backpackSet.add(blanket);
        backpackSet.add(pyjamas);
        backpackSet.add(towel);
        System.out.println("Backpack:"+ backpackSet);

        //Ask if one of them is contained in
        // the set and display the answer.
        backpackSet.contains(blanket);
        System.out.println("Does the set have a blanket?" + backpackSet.contains(blanket));

        //Remove one of them by providing its
        // name as an argument and display the set.
        backpackSet.remove(blanket);
        System.out.println("The Backpack Set is:"+ backpackSet);

        //Ask if the element you just
        // removed is not contained in the set and display the answer.
        if (!backpackSet.contains(blanket)){
            System.out.println("Blanket is not included");
        }
        //Add one of the
        // existing items twice and display the set.
        backpackSet.add(pyjamas);
        System.out.println("The Backpack Set is:"+ backpackSet);
        System.out.println("The Backpack Size is:"+ backpackSet.size());






    }


}
