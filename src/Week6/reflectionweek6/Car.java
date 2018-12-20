package reflectionweek6;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class Car {

    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String drive() {
        return getType() + " " + brand;
    }

    protected abstract String getType();

}

//The Cars class has the getNextCar method
// that receives a brand and creates a random
// automatic or manual car to return it as a Car.