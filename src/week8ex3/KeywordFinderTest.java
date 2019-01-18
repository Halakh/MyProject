package week8ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class KeywordFinderTest {
    private KeywordFinder finder=new KeywordFinder();

    @Test
    void findElegantWord(){
        String sentence= ("The elephant is lifted eleven floors easily with the help of an electricity elevator");
        List<String> filtered=finder.findElegantWords(sentence);
        List<String>expected=Arrays.asList("elephant", "eleven", "electricity", "elevator");
        Assertions.assertEquals(expected,filtered);
    }
    @Test
    void findPlayfulWord() {
        String sentence = "The rightful heir of the powerful king had an awful accident playing with a colorful bear";
        List<String> filtered = finder.findPlayfulWords(sentence);
        List<String> expected = Arrays.asList("rightful", "powerful", "awful", "colorful");
        Assertions.assertEquals(expected, filtered);
    }



}
//@Test
//    void filterNumber(){
//        Predicate<Integer> condition= number->(number %2==0);
//        List<Integer>filtered=filter.filter(numbers,condition);
//        List<Integer>expected=Arrays.asList(2,8,4,6,4);
//        Assertions.assertEquals(expected,filtered);
//
//        condition=number->(number %2!=0);
//        filtered=filter.filter(numbers,condition);
//        expected=Arrays.asList(9,7,5,1);
//        Assertions.assertEquals(expected,filtered);