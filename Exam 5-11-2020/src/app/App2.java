package app;

import java.util.Scanner;

public class App2 {
    public static int SumX(int x) {
        return 1 - x;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(SumX(scan.nextInt()));
    }
}