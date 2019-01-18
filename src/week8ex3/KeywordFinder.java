package week8ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {
    public List<String>findSpecialWords(String sentence, Predicate<String>condition){
        List<String>filtered=new ArrayList<>();
        List<String> words = Arrays.asList(sentence.split(" "));
        for (String word:words) {
            if (condition.test(word)){
                filtered.add(word);
            }

        }
        return filtered;
    }
    public List<String>findElegantWords(String sentence) {
        return findSpecialWords(sentence, word -> word.startsWith("ele"));
    }
    public List<String>findPlayfulWords(String sentence){
        return findSpecialWords(sentence,word->word.endsWith("ful"));
    }

}


