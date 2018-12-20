package week7ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class NicknamesMakerTest {

    private NicknamesMaker maker = new NicknamesMaker();

    @Test
    void testWithNames() {
        List<String> words = Arrays.asList("House", "tree", "Theatre", "somewhere", "bottle");
        List<String> nicknames = Arrays.asList("Ho", "tr", "The", "some", "bot");

        for (int position = 0; position < 5; position++) {
            String word = words.get(position);
            String nickname = maker.makeNickname(word);
            String expected = nicknames.get(position);
            System.out.println("Input: " + word + " Output: " + nickname);
            Assertions.assertEquals(expected, nickname);
        }
    }


}