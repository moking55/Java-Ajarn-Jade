package app;

import java.util.Scanner;

public class App4 {

    public static void BMI(double weight, double height) {
        double hm = height / 100.0;
        double bmi = weight / (hm * hm);
        System.out.println("Your BMI is = " + bmi);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("weight (kg.) = ");
        double weight = kb.nextDouble();
        System.out.print("height (cm.) = ");
        double height = kb.nextDouble();
        BMI(weight, height);
        
    }
}