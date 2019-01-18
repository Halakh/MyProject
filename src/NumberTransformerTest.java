import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberTransformerTest {
    NumberTransformer transformer= new NumberTransformer();

    @Test
    void testTransform(){
        List<Integer> numbers= Arrays.asList(1,2,5,4,8,7);
        List<Integer> transformed = transformer.transfor(numbers, number -> number * 10);
        List<Integer>expected=Arrays.asList(10,20,50,40,80,70);
        Assertions.assertEquals(expected,transformed);

    }
    @Test
    void testDivision(){
        List<Integer> numbers= Arrays.asList(2,2,4,4,6,8);
        List<Integer> transformed = transformer.transfor(numbers, number -> number /2);
        List<Integer>expected=Arrays.asList(1,1,2,2,3,4);
        Assertions.assertEquals(expected,transformed);

    }

}