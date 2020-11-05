package app;

import java.util.Scanner;

public class App3 {
    public static int Grade(int scores) {
        if ((scores > 100) | (scores < 0)) {
            System.out.println("Please Try Again");
        } else if (scores >= 80) {
            System.out.println("Your grade is 4");
        } else if (scores >= 70) {
            System.out.println("Your grade is 3");
        } else if (scores >= 60) {
            System.out.println("Your grade is 2");
        } else if (scores >= 50) {
            System.out.println("Your grade is 1");

        } else {
            System.out.println("Your grade is 0");
        }

        return scores;
    }

    public static void main(final String[] args) {
        float scores;
        final Scanner scan = new Scanner(System.in);
        System.out.print("Enter Scores :");
        scores = Grade(scan.nextInt());
        System.out.println("Your Score is " + scores);

    }

}