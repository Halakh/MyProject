package week9ex4;

import Week4.week4ex9.FileReader;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;

public class HappinessApplication {
    public static void main(String[] args) {
        new FileReader().asList("week9ex4/world-happiness-2017.csv").stream()
                .skip(1)
                .map(e->Arrays.asList(e.split(";")))
                .map(e->new HappinessRecord(e.get(0),Integer.valueOf(e.get(1)),Double.valueOf(e.get(2))))
                .sorted(Comparator.comparing(e->e.getRank()))
                .limit(5)
                .forEach(e-> System.out.println(e));
    }
}
