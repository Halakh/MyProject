package week7ex1;

import java.util.List;

public class MoneyCalculator {
    public Integer accumulate(List<Integer> payments) {
        int sum = 0;
        for (Integer payment : payments) {
            sum += payment;
        }
        return sum;
    }
}

//A MoneyCalculator that receives
// money numbers and returns the accumulated value.
