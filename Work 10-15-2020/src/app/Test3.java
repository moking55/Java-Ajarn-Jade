package app;

import java.util.Scanner;

public class Test3 {
    public static String isodds(int e) {
        String x = "";
        if (e % 2 == 0) {
            System.out.println("is even");
        } else {
            System.out.println("is odd");
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a non-negative number: ");
        int e = in.nextInt();
        System.out.print("the number" + e + isodds(e));

    }
}