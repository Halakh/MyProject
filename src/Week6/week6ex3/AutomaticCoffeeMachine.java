package week6ex3;

public class AutomaticCoffeeMachine extends CoffeeMaker{

    @Override
    public String getName() {
        return "Automatic CoffeeMaker";
    }

    //Implement its methods and return “Automatic coffee machine” as name and 5 as brewing time.

    @Override
    public Integer getBrewingTime() {
        return 5;
    }
}
//Create the AutomaticCoffeeMachine class that extends CoffeeMaker.
//
// Notice that you don’t need to implement the brew method because it’s not abstract.
// All CoffeeMakers will share that code without the need of implementing it. However,
// they need to specify their names and brewing times as customization.