import java.util.Scanner;

public class App_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(" กว้าง : ");
        float Width = scan.nextFloat();

        System.out.print(" ยาว : ");
        float Long = scan.nextFloat();

        System.out.printf(" จำนวนไร่ %.2f ", Width * Long);

        scan.close();
    }
}
