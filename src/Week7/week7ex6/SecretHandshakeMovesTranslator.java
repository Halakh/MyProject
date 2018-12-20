package week7ex6;

import week7ex4.NumberSeparator;

import java.util.ArrayList;
import java.util.List;

public class SecretHandshakeMovesTranslator {
    private List<Handshake> handshakes = Handshakes.asList();

    public List<String> translate(Integer number) {
        NumberSeparator numberSeparator = new NumberSeparator();

        List<String> numberHandshakes = new ArrayList<>();

        List<Integer> digits = numberSeparator.separate(number);
        for (Integer digit : digits) {
            String move = getMove(digit);
            if (move.contains("")) {
                numberHandshakes.add(move);
            }
        }

        return numberHandshakes;

    }

    private String getMove(Integer number) {
        String name = "";
        for (Handshake handshake : handshakes) {
            if (handshake.isHandshake(number)) {
                name = handshake.getName();
            }
        }
        return name;
    }


}

