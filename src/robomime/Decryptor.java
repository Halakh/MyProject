package robomime;

public interface Decryptor {
    String fix(String message);
    boolean isValidForFix (String message);

}
