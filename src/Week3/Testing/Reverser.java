package Testing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverser {
    public String reverse(String text){
        List<String> letters = getLetters(text);
        Collections.reverse(letters);
        String reversed = join(letters);
        return reversed;

    }

    private List<String> getLetters(String text) {
        String[] split= text.split("");
        List<String>immutable = Arrays.asList(split);
        ArrayList<String> mutable = new ArrayList<>(immutable);
        return immutable;

    }

    private String join(List<String> letters) {
        String text = "";
        for (String letter : letters) {
            text+=letter;

        }return null;
    }
}
