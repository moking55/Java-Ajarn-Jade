package app;

public class App6 {
    public static void main(String[] args) {
        int x = 10;
        System.out.print("I am passing values to displayValue");
        displayValue(5);
        displayValue(x);
        displayValue(x * 4);
        displayValue(Integer.parseInt("700"));
        System.out.println("Now i am back in main");
    }

    public static void displayValue(int num) {
        System.out.println("The value is" + num);
    }
}