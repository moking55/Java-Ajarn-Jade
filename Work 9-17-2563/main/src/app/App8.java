package app;

public class App8 {
  String fname = "John"; // สร้างตัวแปรประเภท string
  String lname = "Doe"; // สร้างตัวแปรประเภท string
  int age = 24; // สร้างตัวแปรประเภท int

  public static void main(String[] args) {
    App8 myObj = new App8();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname); // นำ object ที่เป็น string มาแสดงผล
    System.out.println("Age: " + myObj.age); //นำตัวแปรที่เป็น int แสดงผล
  }
}