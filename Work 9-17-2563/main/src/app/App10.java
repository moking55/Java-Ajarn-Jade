package app;

public class App10 {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // method หลัก
  public static void main(String[] args) {
    myStaticMethod(); // เรียกใช้งาน static method
    // หากเรียกใช้ myPublicMethod(); จะขึ้น Error

    App10 myObj = new App10(); // สร้างวัตถุของ MyClass
    myObj.myPublicMethod(); // เรียกใช้ method on the object
  }

}