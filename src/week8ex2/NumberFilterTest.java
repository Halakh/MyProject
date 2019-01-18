package week8ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class NumberFilterTest {
    private NumberFilter filter = new NumberFilter();
    private List<Integer>numbers= Arrays.asList(2,8,9,7,5,4,6,1,4);
    @Test
    void filterNumber(){
        Predicate<Integer> condition= number->(number %2==0);
        List<Integer>filtered=filter.filter(numbers,condition);
        List<Integer>expected=Arrays.asList(2,8,4,6,4);
        Assertions.assertEquals(expected,filtered);

        condition=number->(number %2!=0);
        filtered=filter.filter(numbers,condition);
        expected=Arrays.asList(9,7,5,1);
        Assertions.assertEquals(expected,filtered);

    }


}