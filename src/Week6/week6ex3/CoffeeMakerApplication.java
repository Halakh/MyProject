package week6ex3;

import java.util.List;
import java.util.Optional;

public class CoffeeMakerApplication {
    public static void main(String[] args) {

        List<CoffeeMaker> coffeeMakers = CoffeeMakers.asList();

        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            Coffee coffee1= coffeeMaker.brew();
            System.out.println(coffee1.getMadeBy() + coffee1.getBrewedTime());

        }
        List<CoffeeMaker> coffeeMakers1= CoffeeMakers.asList();
        for (CoffeeMaker coffeeMaker : coffeeMakers1) {
            checkOne(coffeeMaker.getName());


        }
        checkOne("bwahaha");
    }
    private static void checkOne(String name) {
        Optional<CoffeeMaker> coffeeMaker = CoffeeMakers.get(name);
        if (coffeeMaker.isPresent()) {
            coffeeMaker.get().brew();
            System.out.println(coffeeMaker.get().getName() + " brewed a coffee and it took " + coffeeMaker.get().getBrewingTime() + " minutes");
        } else
            System.out.println("The coffee maker with the name " + name + " pot is not available");

    }

}
//Create the CoffeeMakerApplication class and write the
// following instructions in its main method:
//Use the CoffeeMakers class to receive all available coffee makers as a list.
// For each one of them, brew a Coffee and display the madeBy and brewedTime from the Coffee.
//Use the CoffeeMakers class to get one by one each CoffeeMaker.
// Check with the Optional if they are present,
// and if so, use them to brew a Coffee and display the madeBy and brewedTime from it.
//Use the CoffeeMakers class to get one maker that does not exist.
// Check with the Optional that it is not present and display a message
// saying that this particular coffee maker is not available.
