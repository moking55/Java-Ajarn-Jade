public class w4 {
    public static void main(String[] args) {
        int day = 4;
            switch (day) {
              case 1:
                System.out.println("Monday");
                break;
              case 2:
                System.out.println("Tuesday");
                break;
              case 3:
                System.out.println("Wednesday");
                break;
              case 4:
                System.out.println("Thursday");
                break;
              case 5:
                System.out.println("Friday");
                break;
              case 6:
                System.out.println("Saturday");
                break;
              case 7:
                System.out.println("Sunday");
                break;
            }
            /* เนื้อหาของคำสั่ง switch เรียกว่าบล็อก switch คำสั่งในบล็อกswitchสามารถติดป้ายกำกับด้วยตัวพิมพ์ใหญ่หรือป้ายเริ่มต้นอย่างน้อย
            หนึ่งรายการคำสั่ง switch จะประเมินนิพจน์จากนั้นรันคำสั่งทั้งหมดที่เป็นไปตามเคสที่ตรงกัน และใช้คำสั่ง break เพื่อให้โปรแกรมหยุดการ
            ตรวจสอบ */

            int day2 = 4;
            switch (day2) {
              case 6:
                System.out.println("Today is Saturday");
                break;
              case 7:
                System.out.println("Today is Sunday");
                break;
              default:
                System.out.println("Looking forward to the Weekend");
            }
            /* คีย์เวิร์ด default จะรันหากไม่มีเคสที่ตรงกันใน switch */


    }
}