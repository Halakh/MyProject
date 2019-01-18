package robomime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Decryptions {
    public static List<Decryptor> asList(){
        return new ArrayList<>(Arrays.asList(new FixAnd(), new Fixexclamation(), new FixNumber()));
    }
}
