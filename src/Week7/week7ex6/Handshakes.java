package week7ex6;

import java.util.Arrays;
import java.util.List;

public class Handshakes {
    private static List<Handshake> handshakes = Arrays.asList(
            new ThumbTouches(), new Tickles(), new BroKnock(), new ThousandKnuckles()
    );

    public static List<Handshake> asList() {
        return handshakes;
    }

}
