import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoreStreamsPractice {

    public static void main(String[] args) {
        String quote = "If you want to find the secrets of the universe, think in terms of energy, frequency and vibration.";
        List<String> words = Stream.of(quote.split(" "))
                .map(w -> w.replaceAll(",", ""))
                .map(w -> w.replaceAll("\\.", ""))
                .collect(Collectors.toList());
        System.out.println("Words: " + words);


        // count how many times each word appears
        System.out.println("How many times each word appears:");
        Map<String, Long> wordAppearances = words.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        //finding what words appeared the most: we will use an entryset to change a map to a stream to be able to work on it.
        System.out.println("Which word appears the most:");
        Optional<String> mostAppearing = wordAppearances.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + ": appears " + e.getValue() + " times")
                .findFirst();
        if (mostAppearing.isPresent()){
            System.out.println("The most appearing word is "+ mostAppearing);
        }


        //finding the most appearing letters
        List<String> mostAppearingLetters = words.stream()
                .map(word -> word.split(""))
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(3)
                .map(e -> e.getKey() + " was repeated " + e.getValue())
                .collect(Collectors.toList());
        mostAppearingLetters.forEach(e-> System.out.println(e));


        // check if all words at least have more than 3 and 2 letters
        boolean allWordsHaveMoreThan3= words.stream()
                .allMatch(e->e.length()==3);
        System.out.println("All words have at least 3 letters: "+ allWordsHaveMoreThan3);


        // count the total sum of all ascii codes (uses flat map)
        Integer totalAsccii = words.stream()
                .map(word -> word.split(""))
                .flatMap(e -> Stream.of(e))
                .map(letter -> (int) letter.charAt(0))
                .reduce(0, (e1, e2) -> e1 + e2);
        System.out.println("Sum of all ascii codes: "+totalAsccii);





    }













    }