public class w3 {
    public static void main(String[] args) {

        /* สามารถทดสอบสองค่าเพื่อดูว่า 20 มากกว่า 18 หรือไม่ถ้าเงื่อนไขเป็นจริงให้เริ่มคำสั่งในบล็อค */
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }
        /* สามารถใช้ตัวแปรเพื่อตรวจสอบเงื่อนไขได้ */
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }
        /* ในตัวอย่างด้านบนคือใช้ตัวแปร x และ y เพื่อทดสอบว่า x มีค่ามากกว่า y หรือไม่
        เมื่อ x เท่ากับ 20 และ y คือ 18 และ 20 มากกว่า 18 จึงส่งข้อความไปที่หน้าจอว่า "x มากกว่า y" */

        int time = 20;
        if (time < 18) {
          System.out.println("Good day.");
        } else {
          System.out.println("Good evening.");
        }
        /* ในตัวอย่างด้านบนเวลา (20) มากกว่า 18 ดังนั้นเงื่อนไขจึงเป็นเท็จ จึงไปยังเงื่อนไขอื่นและแสดงผลไปที่หน้าจอว่า "Good evening."
        หากตัวแปร Time น้อยกว่า 18 โปรแกรมจะพิมพ์ "Good day" */

        int time2 = 22;
        if (time2 < 10) {
            System.out.println("Good morning.");
        } else if (time2 < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        /* ในตัวอย่างด้านบนเวลา (22) มากกว่า 10 ดังนั้นเงื่อนไขแรกจึงเป็นเท็จ
        เงื่อนไขถัดไปในคำสั่ง else if ก็เป็นเท็จเช่นกันดังนั้นเราจึงไปยังเงื่อนไขอื่นเนื่องจาก condition1 และ condition2
        เป็นเท็จ - จึงส่งข้อความไปที่หน้าจอ "Good evening." */

        int time3 = 20;
        if (time3 < 18) {
          System.out.println("Good day.");
        } else {
          System.out.println("Good evening.");
        }

        int time4 = 20;
        String result = (time4 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        
        /* นอกจากนี้ยังมี if else แบบสั้นซึ่งเรียกว่า ternary operator เนื่องจากประกอบด้วยตัวถูกดำเนินการสามตัว
        สามารถใช้เพื่อแทนที่โค้ดหลายบรรทัดด้วยบรรทัดเดียว มักใช้เพื่อแทนที่คำสั่ง if else อย่างง่าย */
    }
}