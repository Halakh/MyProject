package week7ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberSeparator {

    public List<Integer> separate(Integer number){
        if(number==0) {
            return new ArrayList<>();
        }

        List<Integer>separatedNumbers = new ArrayList<>();
        String digits= number.toString();

        List<String> nums=Arrays.asList(digits.split(""));

        for (String num: nums) {
            Integer digit1= Integer.valueOf(num);
            separatedNumbers.add(digit1);
        }


        return separatedNumbers;
    }
}
//String[] split = message.split("");
//         letters2 = new
