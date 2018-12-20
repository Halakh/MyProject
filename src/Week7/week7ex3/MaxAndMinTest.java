package week7ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MaxAndMinTest {


    MaxAndMin maxAndMin = new MaxAndMin();
    @Test
    void testMin() {
        List<Integer> numbers= Arrays.asList(7, 2, 3, 5);
        Integer expected = 2;
        Integer result = maxAndMin.findMin(numbers);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void testMax() {
        List<Integer> numbers= Arrays.asList(7, 2, 3, 5);
        Integer expected = 7;
        Integer result = maxAndMin.findMax(numbers);
        Assertions.assertEquals(expected, result);
    }

}