package app;

import java.util.Scanner;

public class App5 {
     public static void ListGrade(int[] scores) {
        int n = 1;
        for (int i = 0; i < scores.length; i++) {
            
            if ((scores[i] > 100) | (scores[i] < 0)) {
                System.out.println("Please Try Again");
            } else if (scores[i] >= 80) {
                System.out.println("Person "+ n +" grade is 4");
                n = n+1;
            } else if (scores[i] >= 70) {
                System.out.println("Person "+ n +" grade is 3");
                n = n+1;
            } else if (scores[i] >= 60) {
                System.out.println("Person "+ n +" grade is 2");
                n = n+1;
            } else if (scores[i] >= 50) {
                System.out.println("Person "+ n +" grade is 1");
                n = n+1;
            } else {
                System.out.println("Person"+ n +"grade is 0");
                n = n+1;
            }
        }

    }
 
    public static void main(String[] args) {
        int[] scores = {50,60,70,88,100};
        ListGrade(scores);
    }
        
}