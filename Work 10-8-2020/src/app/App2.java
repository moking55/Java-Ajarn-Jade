package app;

public class App2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello from the main medthod");
        for (int i = 0; i < 5; i++) {
            displayMessage();
            System.out.print("Back in to the main medthod");
        }

    }

    public static void displayMessage() {
        System.out.println("Hello from the display messaahe medthod");
    }
}