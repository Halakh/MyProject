package reflectionweek6;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cars {

    private static Random random = new Random();

    public static Car getNextCar(String brand) {
        boolean automatic = random.nextBoolean();
        if (automatic) {
            return new Automatic(brand);
        }
        return new Manual(brand);
    }

}
