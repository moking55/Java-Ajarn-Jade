package app;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width;
        int height;
        System.out.print("Enter Width: ");
        width = in.nextInt();
        System.out.print("Enter Height: ");
        height = in.nextInt();
        System.out.println("Triangle area is: " + width * height * 0.5);
    }
}