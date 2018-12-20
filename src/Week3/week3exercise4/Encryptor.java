package week3exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Encryptor {
    public String encrypt(String message){
        Random random = new Random();

        message= message.replaceAll("A","4");
        message= message.replaceAll("a","4");
        message= message.replaceAll("E","3");
        message= message.replaceAll("e","3");
        message= message.replaceAll("I","2");
        message= message.replaceAll("i","2");
        message= message.replaceAll("O","8");
        message= message.replaceAll("o","8");
        message= message.replaceAll("U","9");
        message= message.replaceAll("u","9");

        String[] split = message.split("");
        ArrayList<String> letters2 = new ArrayList<String>(Arrays.asList());

        String symbols="!$#@%*+-";
        List<String> newLetters = new ArrayList<>();
        for (String letter: letters2
             ) {
            newLetters.add(letter);
            int randomNumber = random.nextInt(5);
            randomNumber++;
            String partOfSymbols= symbols.substring(1,randomNumber);
            newLetters.add(partOfSymbols);


        }

        String newMessage = "";
        for (String letter:newLetters
             ) {
            newMessage=newMessage+letter;


        }
        return newMessage;



    }

}
