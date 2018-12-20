package week5ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SuperheroCallerTest {
    SuperheroCaller superheroCaller = new SuperheroCaller();


    @Test
    void testCallSuperheroNull() {
        Superhero result = superheroCaller.callSuperhero();
        Assertions.assertNotNull(result);


    }

    @Test
    void testCallSuperheroName() {
        List<String> heroesNames = Arrays.asList("Superman", "Spiderman", "Batman");
        Assertions.assertTrue(heroesNames.contains(superheroCaller.callSuperhero().getName()));
    }
}


//assertEquals(expected,rectangle.getColor())