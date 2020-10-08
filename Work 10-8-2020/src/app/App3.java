package app;

public class App3 {
    public static void main(String[] args) {
        System.out.println("I am starting in main");
        deep();
        System.out.println("Now im back in main");
    }

    public static void deep() {
        System.out.println("I am now deep");
        deeper();
        System.out.println("Now i am back in deep");
    }

    public static void deeper() {
        System.out.println("I am now in deeper");
    }
}