package robomime;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RoboStream {

    private RobotReader reader = new RobotReader();

    public List<String> cleanRubbish() {
        return reader.getCommands().stream()
                .map(e -> clean(e)).map(e -> cleanExclamation(e))
                .map(e -> cleanHash(e))
                .map(e ->cleanRobomime(e)).distinct()
                .collect(Collectors.toList());

    }

    public String clean(String line) {
        return Arrays.asList(line.split(" "))
                .stream().filter(e -> !e.equals("&"))
                .collect(Collectors.joining());


    }


    public String cleanExclamation(String line) {
        return Arrays.asList(line.split(""))
                .stream().filter(e -> !e.equals("!"))
                .collect(Collectors.joining());
    }
    public String cleanRobomime(String line) {
        return Arrays.asList(line.split(" "))
                .stream().filter(e -> !e.equals("robomime"))
                .collect(Collectors.joining());
    }


    public String cleanHash(String line) {
        return Arrays.asList(line.split(""))
                .stream().filter(e -> !e.equals("#"))
                .collect(Collectors.joining());
    }
}
