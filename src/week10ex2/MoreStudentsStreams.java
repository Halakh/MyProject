package week10ex2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MoreStudentsStreams {
    private StudentReader reader = new StudentReader();
    //How many times does each parent level of education appear?
    Map<String, Long> getEducationNumber() {
        return reader.getStudents().stream()
                .map(e -> e.getLevelOfEducation())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }
//Which are the different parent level of educations sorted from most appearing to least appearing?

   public List<String> EducationLevelSortedTopToBottom() {
        return getEducationNumber().entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + "|" + e.getValue())
                .collect(Collectors.toList());
    }

//How many students have parents with a master’s degree and lower grades than 60 on each topic?

    public Long getNumberOfStudentsWithMasterDegreeAndLowerGradeThanSixtyOnEachTopic() {
        return reader.getStudents().stream()
                .filter(s -> s.getWritingScore() < 60)
                .filter(s -> s.getReadingScore() < 60)
                .filter(s -> s.getMathScore() < 60)
                .filter(e -> e.getLevelOfEducation().equalsIgnoreCase("master's degree"))
                .count();
    }

//Which genders and average scores do the three students with the highest average score have?
    public List<String> getTopFourStudentsAveregeScoreAndGender() {
        return reader.getStudents().stream()
                .map(e -> ((e.getWritingScore()+e.getReadingScore()+e.getMathScore())/3) + "|" + e.getGender())
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());


    }
//Is there any student with a parent education level of some high school that has at least 95 in every topic?
    Boolean IsThereAnyStudentWithEducationLevelofSomehigSchoolWith95InEverytopic(){
        return reader.getStudents().stream()
                .filter(e-> e.getLevelOfEducation().equalsIgnoreCase("Some high school"))
                .anyMatch(e-> e.getWritingScore()>95 && e.getWritingScore() >95 && e.getReadingScore()>95);

    }

}

