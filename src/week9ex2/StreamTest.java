package week9ex2;

import Week4.week4ex9.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    private FileReader reader =new FileReader();
    Stream<String>names=reader.asStream("week9ex2/names.txt");

    @Test
    void testNames(){
        List<String> expected = Arrays.asList("El");
        List<String> actual = names
               .filter(e -> e.length() < 4)
               .collect(Collectors.toList());

      Assertions.assertEquals(expected, actual);

    }
    @Test
    void testM(){
        List<String>expected=Arrays.asList("HOSAM","TAMMAM");
        List<String>actual=names
                .filter(e->e.endsWith("m"))
                .map(e->e.toUpperCase())
                .collect(Collectors.toList());
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void testE(){
        List<String>expected=Arrays.asList("Mehran","Norbert","Serife");
        List<String>result=names
                .filter(e->e.contains("r")&& e.contains("e"))
                .collect(Collectors.toList());
        Assertions.assertEquals(expected,result);

    }
    @Test
    void exactlyFour(){
        List<String>expected=Arrays.asList("maarj", "aamin", "omaar");
        List<String>result=names
                .filter(e->e.length()==4)
                .map(e->e.toLowerCase())
                .filter(e->e.contains("a")&&e.contains("m"))
                .map(e->e.replaceAll("a","aa"))
                .collect(Collectors.toList());
        Assertions.assertEquals(expected,result);

    }


}
//Create a list with the names that are exactly four characters long, make them lower case,
// keep those that contain the letters “a” and “m” and duplicate the number of letter “a”s that they have.