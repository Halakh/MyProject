package week3exercise1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class ScreenTest {
    Screen screen = new Screen();


    @Test
    void testBusinessCustomer() {
        Customer customer=new Customer("Sam","Business");
        String name = screen.display(customer);
        Assertions.assertEquals("SAM",name);

    }
}