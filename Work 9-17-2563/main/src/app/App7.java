package app;

public class App7 {
    int x = 5;
  public static void main(String[] args) {
    App7 myObj1 = new App7();  // Object 1
    App7 myObj2 = new App7();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // แสดงผล Object 1
    System.out.println(myObj2.x);  // แสดงผล Object 2
  }
}