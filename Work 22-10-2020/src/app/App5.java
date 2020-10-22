package app;

import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        final int EMPLOYEES = 5;
        double payRate;
        double grossPay;
        int[] hours = new int[EMPLOYEES];
        Scanner keyboard = new Scanner(System.in);

        System.out.println(
                "Enter the hours of worked by" + EMPLOYEES + "employee who all earn" + "the same hourly rate.");
        for (int index = 0; index < EMPLOYEES; index++) {
            System.out.println("Employee #" + (index + 1) + ": ");
            hours[index] = keyboard.nextInt();
        }
        System.out.print("Enter the hourly pay rate for each employee: ");
        payRate = keyboard.nextDouble();
        System.out.println("Here is each employees gross pay:");
        for (int index = 0; index < EMPLOYEES; index++) {
            grossPay = hours[index] * payRate;
            System.out.println("Employee #" + (index + 1) + ": $" + grossPay);
        }
    }

}