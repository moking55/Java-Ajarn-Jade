package app;

public class App2 {
    public static void main(String[] args) {
        phuket();
        rayone();
    }

    private static void rayone() {
        int birds = 3500;
        System.out.println("In rayone there are" + birds + "birds.");
    }

    private static void phuket() {
        int birds = 5000;
        System.out.println("In phuket there are" + birds + "birds.");
    }
}