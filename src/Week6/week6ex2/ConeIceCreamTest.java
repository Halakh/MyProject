package week6ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week6ex2.ConeIceCream;
import week6ex2.CupIceCream;

import static org.junit.jupiter.api.Assertions.*;

class ConeIceCreamTest {
    @Test
    void testConeIceCream(){
        String expected = "The chocolate ice-cream with oreo is licked.";
        ConeIceCream coneIceCream = new ConeIceCream("chocolate","oreo");
        String result=coneIceCream.eat();
        Assertions.assertEquals(expected,result);
    }
    @Test
    void testCupIceCream() {
        String expected = "The vanilla ice-cream with cookies is eaten with a spoon.";
        CupIceCream cupIceCream = new CupIceCream("vanilla", "cookies");
        String result = cupIceCream.eat();
        Assertions.assertEquals(expected,result);
    }

}