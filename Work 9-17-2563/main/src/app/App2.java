package app;

public class App2 {
    int x = 10; // ตัวแปร x มีค่าเท่ากับ 10
    public static void main(String[] args){
        App2 myObj1 = new App2();  // Object 1
        App2 myObj2 = new App2();  // Object 2
        System.out.println(myObj1.x); // ปริ้น Object 1
        System.out.println(myObj2.x); // ปริ้น Object 2
    }
}