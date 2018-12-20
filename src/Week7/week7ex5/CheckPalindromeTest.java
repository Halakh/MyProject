package week7ex5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPalindromeTest {
    @Test
    void testPalindrome() {
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        String word = "madam";
        boolean expected = true;
        boolean result = checkPalindrome.isPalindrom(word);
        Assertions.assertEquals(expected, result);
    }

}