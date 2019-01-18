package robomime;

public class FixNumber implements Decryptor {
    @Override
    public String fix(String message) {
        message=message.replaceAll("#","");
        String robomime = message.replaceAll("robomime", "");
        return robomime;
    }

    @Override
    public boolean isValidForFix(String message) {
        return message.contains("#");
    }
}
