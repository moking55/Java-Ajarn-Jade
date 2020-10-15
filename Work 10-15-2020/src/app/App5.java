package app;

public class App5 {
    public static char calculate(int score) {
        char grade;

        if (score >= 80) {
            grade = 'A';
        } else if (score >= 60 && score < 80) {
            grade = 'B';
        } else if (score >= 40 && score < 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }
    public static void main(String[] args) {
        System.out.println("Your grade is " + calculate(75));
    }
}