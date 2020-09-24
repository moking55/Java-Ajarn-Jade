import java.util.Scanner;

public class App_1 {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Welcome " + userName + " To Exam");
    }
}
