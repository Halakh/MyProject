package week7ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MoneyCalculatorTest {
    @Test
    void testWithNumbers() {
        List<Integer> payments = Arrays.asList(2, 3, 5);
        Integer expected = 10;
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        Integer result = moneyCalculator.accumulate(payments);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testNoNumbers() {
        List<Integer> payments = new ArrayList<>();
        Integer expected = 0;
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        Integer result = moneyCalculator.accumulate(payments);
        Assertions.assertEquals(expected, result);
    }

}