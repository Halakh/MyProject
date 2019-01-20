package refelctionweek9;

public class StudentApplication {
    public static void main(String[] args) {
        StudentPerformance studentPerformance = new StudentPerformance();
        System.out.println("Number of female students: "+studentPerformance.getGirls());
        System.out.println("Number of male students: "+studentPerformance.getBoys());
        System.out.println("Parental education levels sorted alphabetically: "+studentPerformance.sortEducation());
        System.out.println("Number of students with scores higher than 90: "+studentPerformance.getStudentsScoringHigherThan90());
        System.out.println("Number of students with scores equal to 100: "+studentPerformance.getStudentsScoring100());
        System.out.println("Genders of these students are: "+ studentPerformance.getGendersScoring100());


    }

}
