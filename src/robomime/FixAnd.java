package robomime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FixAnd implements Decryptor {
    @Override
    public boolean isValidForFix(String message) {
        return message.contains("&");
    }

    @Override
    public String fix(String message) {
        message=message.replaceAll("&","");
        String reverse = reverse(message);


        return reverse;
    }

    private String reverse(String message) {
        String[] letters = message.split("");
        List<String> instructions =new ArrayList<>(Arrays.asList(letters));
        Collections.reverse(instructions);
        String reversed = String.join("", instructions);
        return reversed;



    }
}
