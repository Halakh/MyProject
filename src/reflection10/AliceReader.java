package reflection10;

import Week4.week4ex9.FileReader;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AliceReader {
    FileReader reader = new FileReader();

    public List<String> getWords() {
        return reader.asList("reflection10/alice.txt").stream()
                .skip(31)
                .map(String::toLowerCase)
                .map(e->e.replaceAll(","," "))
                .map(e->e.replaceAll(";"," "))
                .map(e->e.replaceAll("'s"," "))
                .map(e->e.replaceAll("'"," "))
                .map(e->e.replaceAll("‘"," "))
                .map(e->e.replaceAll(":"," "))
                .map(e->e.replaceAll("#"," "))
                .map(e->e.replaceAll("/"," "))
                .map(e->e.replaceAll("-"," "))
                .map(e->e.replaceAll("\\."," "))
                .map(e->e.replaceAll("\\*"," "))
                .map(e->e.replaceAll("\\("," "))
                .map(e->e.replaceAll("\\)"," "))
                .map(e->e.replaceAll("\\]"," "))
                .map(e->e.replaceAll("\\["," "))
                .map(e -> Arrays.asList(e.split(" ")))
                .flatMap(List::stream)
                .filter(e->!e.isEmpty())
                .collect(Collectors.toList());


    }


}
