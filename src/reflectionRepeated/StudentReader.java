package reflectionRepeated;

import Week4.week4ex9.FileReader;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {
    private FileReader reader=new FileReader();
    public List<Student> getStudents(){
        return reader.asStream("refelctionweek9/students-performance.csv")
                .skip(1)
                .map(l-> Arrays.asList(l.split(";")))
                .map(l->new Student(l.get(0),
                        l.get(1),
                        Integer.valueOf(l.get(2)),
                        Integer.valueOf(l.get(3)),
                        Integer.valueOf(l.get(4))))
                .collect(Collectors.toList());

    }
}
