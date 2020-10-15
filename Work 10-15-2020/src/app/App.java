package app;

public class App {
    public static void main(String[] args) throws Exception {
        int x = 5;
        System.out.println("x ="+x);
        one();
        System.out.println("x ="+x);
    }
    public static void one() {
        int x = 3;
        System.out.println("x ="+x);
    }
}