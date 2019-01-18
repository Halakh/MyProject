package robomime;

public class Fixexclamation implements Decryptor {
    @Override
    public boolean isValidForFix(String message) {
        return  message.contains("!");
        }

    @Override
    public String fix(String message) {

        String message1= message.replaceAll("!","");
        return message1;
    }
}
