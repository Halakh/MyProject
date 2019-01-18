package refelctionweek9;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentPerformance {
    private StudentReader reader=new StudentReader();
    public Long getGirls(){
        return reader.getStudents().stream()
                .skip(1)
                .filter(s->s.getGender()=="female")
                .count();


    }
    public Long getBoys(){
        return reader.getStudents().stream()
                .skip(1)
                .filter(s->s.getGender()=="male")
                .count();
    }

    public Set<Student> sortEducation(){
        return reader.getStudents().stream()
                .skip(1)
                .sorted(Comparator.comparing(Student::getLevelOfEducation))
                .collect(Collectors.toSet());
    }
    public Long getStudentsScoringHigherThan90(){
        return reader.getStudents().stream()
                .skip(1)
                .sorted(Comparator.comparing(Student::getReadingScore))
                .sorted(Comparator.comparing(Student::getMathScore))
                .sorted(Comparator.comparing(Student::getWritingScore))
                .filter(s->s.getReadingScore()>90)
                .filter(s->s.getWritingScore()>90)
                .filter(s->s.getMathScore()>90)
                .count();

    }

    public Long getStudentsScoring100() {
        return reader.getStudents().stream()
                .skip(1)
                .sorted(Comparator.comparing(Student::getMathScore))
                .sorted(Comparator.comparing(Student::getReadingScore))
                .sorted(Comparator.comparing(Student::getWritingScore))
                .filter(s -> s.getMathScore() == 100)
                .filter(s -> s.getWritingScore() == 100)
                .filter(s -> s.getReadingScore() == 100)
                .count()

    }
    public List<Student> getGendersScoring100() {
        return reader.getStudents().stream()
                .skip(1)
                .sorted(Comparator.comparing(Student::getMathScore))
                .sorted(Comparator.comparing(Student::getReadingScore))
                .sorted(Comparator.comparing(Student::getWritingScore))
                .filter(s -> s.getMathScore() ==100)
                .filter(s -> s.getWritingScore() ==100)
                .filter(s -> s.getReadingScore() ==100)
                .map(s->s.getGender())
                .collect(Collectors.toList())

    }




}


//How many boys and girls are there?
//Which are the distinct parental levels of education sorted alphabetically?
//How many students scored higher than a 90 on every topic?
//How many students scored exactly 100 on every topic? Which ones are their genders?