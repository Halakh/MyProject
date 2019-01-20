package reflectionRepeated;

public class StudentApplication {
    public static void main(String[] args) {
        StudentPerformance assess=new StudentPerformance();

        System.out.println("Total number of student performance entries: " +assess.getNumberOfStudent());
        System.out.println("Total number of male students: "+assess.getBoys());
        System.out.println("Total number of female students: "+assess.getGirls());
        System.out.println("Parental education levels sorted alphabetically: "+assess.getLevelsOfEducation());
        System.out.println("Number of students with scores higher than 90: "+assess.getScoresHigherThan90());
        System.out.println("Number of students with scores equal to 100: "+assess.getScores100());
        System.out.println("Genders of students with scores equal to 100: "+assess.get100ScoresGenders());

    }
}
