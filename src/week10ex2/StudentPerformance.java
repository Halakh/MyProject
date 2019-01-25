package week10ex2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentPerformance {
    private StudentReader reader = new StudentReader();

    public Integer getGirls() {
        return reader.getStudents().stream()
                .filter(s -> s.getGender().equalsIgnoreCase("female"))
                .collect(Collectors.toList())
                .size();


    }

    public Long getBoys() {
        return reader.getStudents().stream()
                .filter(s -> s.getGender().equalsIgnoreCase("male"))
                .count();
    }

    public List<String> sortEducation() {
        return reader.getStudents().stream()
                .map(s -> s.getLevelOfEducation())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public Long getStudentsScoringHigherThan90() {
        return reader.getStudents().stream()
                .skip(1)
                .sorted(Comparator.comparing(Student::getReadingScore))
                .sorted(Comparator.comparing(Student::getMathScore))
                .sorted(Comparator.comparing(Student::getWritingScore))
                .filter(s -> s.getReadingScore() > 90)
                .filter(s -> s.getWritingScore() > 90)
                .filter(s -> s.getMathScore() > 90)
                .count();

    }

    public Long getStudentsScoring100() {
        return reader.getStudents().stream()
                .filter(s -> s.getMathScore() == 100)
                .filter(s -> s.getWritingScore() == 100)
                .filter(s -> s.getReadingScore() == 100)
                .count();

    }

    public List<Student> getGendersScoring100() {
        return reader.getStudents().stream()
                .filter(s -> s.getMathScore() == 100)
                .filter(s -> s.getWritingScore() == 100)
                .filter(s -> s.getReadingScore() == 100)
                .collect(Collectors.toList());

    }

}





//How many boys and girls are there?
//Which are the distinct parental levels of education sorted alphabetically?
//How many students scored higher than a 90 on every topic?
//How many students scored exactly 100 on every topic? Which ones are their genders?