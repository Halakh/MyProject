package refelction8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThermostatTest {

    @Test
    void testSki(){
        Thermostat thermostat = new Thermostat(t->t<0,t->t+" degrees celsius" );
        String message= thermostat.sense(2.0);
        Assertions.assertEquals("2.0 degrees celsius",message);






    }
}

