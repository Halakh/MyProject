package week10ex3;

import java.util.stream.Collectors;

public class SmsMethods {
    private SmsReader reader= new SmsReader();
    public String getHamToSpamRatio() {
        return reader.getLines().stream()
                .map(Sms::getName)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " " + (e.getValue() * 100 / reader.getLinesNumber()) + "%")
                .collect(Collectors.joining());
    }
    }
