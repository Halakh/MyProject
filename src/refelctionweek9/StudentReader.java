package refelctionweek9;

import Week4.week4ex9.FileReader;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {
    private FileReader reader=new FileReader();

    public List<Student> getStudents(){
        return reader.asStream("refelctionweek9/students-performance.csv")
                .skip(1)
                .map(s -> Arrays.asList(s.split(";")))
                .map(s->new Student(s.get(0),s.get(1),Integer.valueOf(s.get(2)),Integer.valueOf(s.get(3)),Integer.valueOf(s.get(4))))
                .collect(Collectors.toList());

    }
}