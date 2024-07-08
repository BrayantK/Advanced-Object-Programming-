public class GradeEvaluator {

    public static void main(String[] args) {
        double averageMarks = 85; // You can change this value to test different scenarios
        int passMark = 75;
        evaluateGrade(averageMarks, passMark);
    }

    public static void evaluateGrade(double averageMarks, int passMark) {
        char grade;
        String result;

        if (averageMarks >= 93) {
            grade = 'A';
        } else if (averageMarks >= 85) {
            grade = 'B';
        } else if (averageMarks >= 80) {
            grade = 'C';
        } else if (averageMarks >= 75) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        if (averageMarks >= passMark) {
            result = "Passed exam";
        } else {
            result = "Fail exam";
        }

        System.out.println("Grade: " + grade);
        System.out.println(result);
    }
}
