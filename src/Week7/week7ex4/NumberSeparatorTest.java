package week7ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberSeparatorTest {
    @Test
    void testSeparateWithNumbers() {
        NumberSeparator numberSeparator=new NumberSeparator();
        Integer number = 35842;
        List<Integer> expected = Arrays.asList(3, 5, 8, 4, 2);
        List<Integer> result=numberSeparator.separate(number);
        Assertions.assertEquals(expected,result);
    }


}