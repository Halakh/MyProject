package week7ex5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CheckPalindrome {


    public boolean isPalindrom(String word){
        if(word.length()<2){
            return false;
        }
        word=word.replaceAll(" ","");
        word=word.toLowerCase();
        Integer partSize=word.length()/2;
        String wordReversed= reverse(word);
        if (word==wordReversed){
            return true;
        }
        return true;



    }

    public String reverse(String word){
        List<String> letters= Arrays.asList(word.split(""));
        Collections.reverse(letters);
        String reversedWord=String.join("",letters);
        return reversedWord;
    }




}
