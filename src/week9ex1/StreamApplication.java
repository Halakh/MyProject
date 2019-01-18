package week9ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamApplication {
    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>();
        int position=0;
        while(position<21){
            numbers.add(position);
            position++;
        }
        System.out.println(numbers);


        List<Integer>evenNumbers= numbers.stream()
                .filter(number->number%2==0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: "+evenNumbers);


        List<Integer>oddNumbers=numbers.stream()
                .filter(number->number%2!=0)
                .collect(Collectors.toList());
        System.out.println("Odd numbrs: "+oddNumbers);


        List<Integer>divisibleByThree=numbers.stream()
                .filter(number->number%3==0 && number>10)
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by 3 and bigger than 10: "+divisibleByThree);


        List<Integer>smallerThanFiveMultiplied=numbers.stream()
                .filter(number->number<5)
                .map(number->number*3)
                .collect(Collectors.toList());
        System.out.println("Numbers smaller than 5 and multiplied by 3 "+ smallerThanFiveMultiplied);

        List<String>digits=numbers.stream()
                .filter(number->number<12 &&number>8)
                .map(number->number.toString())
                .map(number->"number"+ number +" has "+ number.length()+ " digits")
                .collect(Collectors.toList());
        System.out.println(digits);







    }

}
