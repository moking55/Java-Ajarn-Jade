import java.util.Scanner;

public class app_7 {
    public static void main(String[] args) {
        float scores;
        Scanner scan = new Scanner(System.in);
        System.out.print("ป้อนคะแนนของคุณ :");
        scores = scan.nextInt();

        if ((scores > 100) | (scores < 0)) {
            System.out.println("Please Try Again");
        } else if (scores >= 80) {
            System.out.println("คุณได้เกรด 4");
        } else if (scores >= 70) {
            System.out.println("คุณได้เกรด 3");
        } else if (scores >= 60) {
            System.out.println("คุณได้เกรด 2");
        } else if (scores >= 50) {
            System.out.println("คุณได้เกรด 1");

        } else {
            System.out.println("คุณได้เกรด 0");
        }
    }
}
