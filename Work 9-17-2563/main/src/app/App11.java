package app;

public class App11 {
  // สร้าง method fullThrottle() 
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // สร้าง method speed() method และเติมค่าเข้าไป
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // ภายใน Main 
  public static void main(String[] args) {
    App11 myCar = new App11();     // สร้าง object mycar
    myCar.fullThrottle();      // เรียกใช้ fullThrottle() method
    myCar.speed(200);          // เรียกใช้ the speed() method
  }

}