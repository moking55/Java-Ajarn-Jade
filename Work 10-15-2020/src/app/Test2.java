package app;

import java.util.Scanner;

public class Test2 {
    public static String calc(int e) {
        String x = "";
        if (e <= 10) {
            x = Double.valueOf(Math.pow(e, 3)).toString();
        } else {
            x = "Out of number";
        }
        return x;
    }

    public static void main(final String[] args) {
        int e;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        e = in.nextInt();
        System.out.println("int is = " + calc(e));

    }
}