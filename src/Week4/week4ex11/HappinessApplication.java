package week4ex11;

import week4ex9.FileReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HappinessApplication {
    public static void main(String[] args) {
        //when we want to recall a class we just use the following statement

        FileReader fileReader = new FileReader();
        ////because the output is (lines),
        // we make a new list to add things to
        List<String> lines = fileReader.asLines("week4ex11/world-happiness-2017.csv");
        //the first line is titles so we remove it
        lines.remove(0);
        //separating the lines into sections to create the happiness record
        List<HappinessRecord> records = new ArrayList<>();
        for (String line : lines) {
            String[] split = line.split(";");
            //because i don't need to manipulate the data in the array, i can still use it as it is;
            // so no need for : List<String> splitList = Arrays.asList(split);
            //the first element in split string collection
            String country = split[0];
            Integer rank = Integer.valueOf(split[1]);
            Double score = Double.valueOf(split[2]);
            HappinessRecord happinessRecord = new HappinessRecord(country,rank,score);
            records.add(happinessRecord);
        }
        Collections.sort(records, Comparator.comparing(HappinessRecord::getRank));
        for (int position = 0; position < 5; position++) {
            HappinessRecord happinessRecord = records.get(position);
            System.out.println(happinessRecord);
        }

    }
}
