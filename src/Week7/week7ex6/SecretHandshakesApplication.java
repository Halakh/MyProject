package week7ex6;

import java.util.List;

public class SecretHandshakesApplication {
    public static void main(String[] args) {
        SecretHandshakeMovesTranslator translator = new SecretHandshakeMovesTranslator();
        List<String> moves = translator.translate(56899);
        System.out.println(moves);
    }
}
