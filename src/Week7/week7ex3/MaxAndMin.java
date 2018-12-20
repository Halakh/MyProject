package week7ex3;


import java.util.Collections;
import java.util.List;

public class MaxAndMin {
    public Integer findMax(List<Integer>numbers) {

        Collections.sort(numbers);
        Integer max = numbers.get(numbers.size() - 1);
        return max;

    }
    public Integer findMin(List<Integer>numbers){
        Collections.sort(numbers);
        Integer min = numbers.get(0);
        return min;




        }
}

