package week5ex3;

import org.junit.jupiter.api.Test;
import week5ex1.Circle;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testRectangleGetName() {
            String expected = "rectangle";
            Rectangle rectangle = new Rectangle();
            assertEquals(expected,rectangle.getName());
    }



    @Test
    void testRectangleGetColor() {
        String expected = "violet";
        Rectangle rectangle = new Rectangle();
        assertEquals(expected,rectangle.getColor());
    }
}