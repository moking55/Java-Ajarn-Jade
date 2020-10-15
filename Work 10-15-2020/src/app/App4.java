package app;

import java.util.Scanner;

public class App4 {
    public static void Bar(final int data) {
        for (int x = 1; x <= data; x++) 
            System.out.print("*");
        System.out.println();
    }
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        int x;
        System.out.print("input data: ");
        x = in.nextInt();
        Bar(x);
    }
}