
package app;

public class App6 {
    int x = 10; // สร้างตัวแปรชื่อ x โดยมีค่าเท่ากับ 10
  public static void main(final String[] args) {
    final App6 myObj = new App6(); // สร้างวัตถุชื่อ "myObj"
    myObj.x = 25; // จะขึ้น Error ว่า cannot assign a value to a final variable
    System.out.println(myObj.x); // พิมพ์ค่า x
  }
}