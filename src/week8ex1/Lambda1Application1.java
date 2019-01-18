package week8ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda1Application1 {
    public static void main(String[] args) {
        List<String>words=new ArrayList<>(Arrays.asList("somewhere", "scenario", "table", "cable", "glass", "backpack", "mouse"));
        System.out.println(words);

        words.removeIf(word->word.endsWith("e"));
        System.out.println(words);

        words.replaceAll(word->word.toUpperCase());
        System.out.println(words);

        words.removeIf(word->word.length()<6);
        System.out.println(words);

        words.forEach(word-> System.out.println(word));



        }





    }

//Use the removeIf method to remove every word that ends with the letter e.
//Use the replaceAll method to transform every word in their uppercase version.
//Use the removeIf method to remove every word that has less than six letters.
//Use the forEach method to print every word one by one.
