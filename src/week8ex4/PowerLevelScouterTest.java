package week8ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerLevelScouterTest {
    PowerLevelScouter powerLevelScouter = new PowerLevelScouter();
    @Test

    void testAscii(){
        String word="Susana";
        Integer expected = 619;
        Integer result=powerLevelScouter.scout(word);
        Assertions.assertEquals(expected,result);

    }
    @Test

    void testAsciii() {
        String word = "Susana";
        Integer expected = 651;
        Integer result = powerLevelScouter.scoutEnhanced(word);
        Assertions.assertEquals(expected, result);
    }
}