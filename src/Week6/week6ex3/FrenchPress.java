package week6ex3;

public class FrenchPress extends CoffeeMaker {
    @Override
    public String getName() {
        return "French Press";
    }

    @Override
    public Integer getBrewingTime() {
        return 10;
    }
}
//Create the FrenchPress class that extends CoffeeMaker. Implement its methods with the help of Intellij.
// Return “French press” as name and 10 as brewing time.
