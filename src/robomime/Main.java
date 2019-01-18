package robomime;



import Week4.week4ex9.FileReader;

import java.util.List;

public class Main {
    private static Sensor sensor = new Sensor();

    public static void main(String[] args) {
        List<String> lines = readLines();
        List<String> instructions = sensor.toInstructions(lines);
        System.out.println(instructions);

    }

    private static List<String> readLines() {
        FileReader reader = new FileReader();
        return reader.asList("robomime/robomime.txt");

    }

}


