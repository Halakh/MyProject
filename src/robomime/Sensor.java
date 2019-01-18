package robomime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sensor {
    private List<Decryptor> fixes = Arrays.asList(new FixAnd(), new Fixexclamation(), new FixNumber());

    public List<String> toInstructions(List<String> lines) {
        List<String> instructions = new ArrayList<>();
        for (String message : lines) {
            String newMessage = decrypt(message);
            instructions.add(newMessage);

        }
        return instructions;
    }

    private String decrypt(String message) {
        for (Decryptor fixer : fixes) {
            if (fixer.isValidForFix(message)) {
                return fixer.fix(message);
            }

        }
        return decrypt(message);
    }


}
