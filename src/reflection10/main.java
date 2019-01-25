package reflection10;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        AliceReader reader = new AliceReader();
        Long numberOfWords=reader.getWords().stream()
                .count();
        System.out.println("Words" + numberOfWords);





        Long numberOfDistinctWords=reader.getWords().stream()
                .distinct()
                .count();
        System.out.println("Words" + numberOfDistinctWords);






        Map<Integer, List<String>> lengths = reader.getWords().stream()
                .collect(Collectors.groupingBy(e -> e.length(), Collectors.toList()));




        Optional<String> mostAppearing = reader.getWords().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + ": appears " + e.getValue() + " times")
                .limit(5);
        if (mostAppearing.isPresent()){
            System.out.println("The most appearing word is "+ mostAppearing);
        }

        List<String> mostAppearingLetters = reader.getWords().stream()
                .map(word -> word.split(""))
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getKey() + " was repeated " + e.getValue())
                .collect(Collectors.toList());
        mostAppearingLetters.forEach(e-> System.out.println(e));









    }
}
    //How many words are in the book?
      //  How many distinct words are in the book?
        //Which words belong to the group of the longest words?
        //Which ones are the most appearing 5 words, sorted by most appearing and how many times do they appear?
        //Which ones are the most appearing 5 letters, sorted by most appearing and how many times do they appear?
        //How many times does the name Alice appear?

