package week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class exercise17 {

    public static void main(String[] args) {

        Collection<String> words = Arrays.asList("Please", "No", "Advertisement");
        Collection<String> newWords = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            newWords.add(word);

        }System.out.println(newWords);
    }
}
