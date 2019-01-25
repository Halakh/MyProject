package week10ex3;

import Week4.week4ex9.FileReader;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmsReader {
    FileReader reader = new FileReader();
public List<Sms> getLines(){
    return reader.asStream("week10ex3/sms.csv")
            .skip(1)
            .map(e-> Arrays.asList(e.split(";")))
            .map(e->new Sms(e.get(0),e.get(1)))
            .collect(Collectors.toList());
}
    public Long getLinesNumber() {
        return reader.asStream("JavaWeek10/Exercise3/sms.csv")
                .skip(1)
                .count();
    }

}