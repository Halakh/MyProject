package reflectionRepeated;

import sun.nio.ch.LinuxAsynchronousChannelProvider;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentPerformance {
    StudentReader reader= new StudentReader();
    public Long getNumberOfStudent(){
        return reader.getStudents().stream()
                .count();
    }

    public Long getBoys(){
        return reader.getStudents().stream()
                .filter(s->s.getGender().equalsIgnoreCase("male"))
                .count();
    }
    public Long getGirls(){
        return reader.getStudents().stream()
                .filter(s->s.getGender().equalsIgnoreCase("female"))
                .count();
    }
    public List<String> getLevelsOfEducation(){
        return reader.getStudents().stream()
                .map(s->s.getLevelOfEducation())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

    }
    public Long getScoresHigherThan90(){
        return reader.getStudents().stream()
                .filter(s->s.getWritingScore() > 90)
                .filter(s->s.getReadingScore() > 90)
                .filter(s->s.getMathScore() > 90)
                .count();

    }
    public Long getScores100(){
        return reader.getStudents().stream()
                .filter(s->s.getWritingScore() ==100)
                .filter(s->s.getReadingScore() ==100)
                .filter(s->s.getMathScore() ==100)
                .count();


    }
    public List<Student> get100ScoresGenders(){
        return reader.getStudents().stream()
                .filter(s->s.getWritingScore() ==100)
                .filter(s->s.getReadingScore() ==100)
                .filter(s->s.getMathScore() ==100)
                .collect((Collectors.toList()));

    }




}//How many students scored higher than a 90 on every topic?
//How many students scored exactly 100 on every topic? Which ones are their genders?