package reflection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberMirror {

    public Integer mirror(Integer number){
        String stringNumber = number.toString();

        String[] stringDigits = stringNumber.split("");
        List<String> immutableDigits = Arrays.asList(stringDigits);
        List<String> mutableDigits = new ArrayList<>(immutableDigits);

        mutableDigits = reverse(mutableDigits);
        String reversedDigitsAsString = String.join("",mutableDigits);
        Integer reversedNumber = Integer.valueOf(reversedDigitsAsString);
        return reversedNumber;

    }

    private List<String> reverse(List<String> mutableDigits) {
        List<String> reversed = new ArrayList<>();
        int size = mutableDigits.size();
        for(int position=size-1; position>=0; position--){
            String digit = mutableDigits.get(position);
            reversed.add(digit);
        }

        return reversed;
    }


}

