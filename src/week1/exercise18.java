package week1;

import java.util.Scanner;

    public class exercise18 {
        public static void main(String[] args) {
            System.out.println("please say a word.");
            Scanner scan1 = new Scanner(System.in);
            String name = scan1.nextLine();
            String newName = formatToBrackets(name);
            System.out.println(newName);


        }

        public static String formatToBrackets(String word) {

            String transformed = "";
            Integer length = word.length();
            String firstLetter = word.substring(0,1);
            firstLetter = firstLetter.toUpperCase();
            String lastLetter = word.substring(length-1);
            lastLetter = lastLetter.toUpperCase();
            String middle = word.substring(1,length-1);
            middle = middle.toLowerCase();
            transformed = firstLetter + middle + lastLetter;

            return transformed;
        }
    }

