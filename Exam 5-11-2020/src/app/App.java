package app;

import java.util.Scanner;

public class App {
    public static int CalAge(int years) {
        return 2020 - years;
    }

    public static void main(final String[] args) throws Exception {
        System.out.println("Enter your birth year:");
        final Scanner scan = new Scanner(System.in);
        System.out.println(CalAge(scan.nextInt()));
    }
}