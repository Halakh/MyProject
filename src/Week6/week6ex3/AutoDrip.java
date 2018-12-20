package week6ex3;

public class AutoDrip extends CoffeeMaker{
    @Override
    public String getName() {
        return "Auto Drip";
    }
    @Override
    public Integer getBrewingTime(){
        return 6;
    }
}
//Create the AutoDrip class that extends CoffeeMaker. Implement its methods with the help of Intellij.
// Return “Auto drip” as name and 6 as brewing time.
