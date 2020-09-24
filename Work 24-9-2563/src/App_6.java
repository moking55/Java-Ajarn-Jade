import java.util.Scanner;

public class App_6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("น้ำหนัก (kg.) = ");
        double weight = kb.nextDouble();
        System.out.print("ความสูง (cm.) = ");
        double height = kb.nextDouble();
        double hm = height / 100.0;
        double bmi = weight / (hm * hm);
        System.out.println("ดัชนีมวลกาย = " + bmi);
    }
}
