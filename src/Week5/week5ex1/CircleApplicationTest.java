package week5ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleApplicationTest {

    @Test
    void testCircle () {
        String expected = "Circle";
        Circle circle = new Circle();
        assertEquals(expected,circle.getName());

    }


}