package week6ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {


    private static List<CoffeeMaker> coffeeMakers = Arrays.asList(new FrenchPress(), new AutoDrip(), new AutomaticCoffeeMachine());

    protected static List<CoffeeMaker> asList() {
        return coffeeMakers;
    }

    public static Optional<CoffeeMaker> get(String name) {
        //List<CoffeeMaker> makers = asList();
        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            if (coffeeMaker.getName().equalsIgnoreCase(name)) {
                return Optional.of(coffeeMaker);
            }

        }
        return Optional.empty();

    }


}

//Create the CoffeeMakers class.
// It has the asList static method that returns the three CoffeeMakers as a list of CoffeeMaker.
//before we do it we have to prepare the list in advance
// It has the get static method that receives a String representing the name of the coffee maker
// you want to receive, and it returns an Optional with the CoffeeMaker
// you wanted if it found it within its list of available ones.
// Otherwise an empty one.

//
//public Optional<Double> calculate(Double weight, String planetName) {
//for (Planet planet : planets) {
//if (has(planet, planetName)) {
// Double newWeight = planet.weight(weight);
//return Optional.of(newWeight);
//}
//}
//return Optional.empty();
//}
