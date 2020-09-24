public class w2 {

public static void main(String[] args) {
    
    // ประเภทบูลีนถูกประกาศด้วยคีย์เวิร์ดบูลีนและสามารถรับเฉพาะค่าจริงหรือเท็จเท่านั้น

    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun);     // ผลลัพท์ = true
    System.out.println(isFishTasty);   // ผลลัพท์ = false


    /* นิพจน์บูลีนคือนิพจน์ Java ที่ส่งคืนค่าบูลีนว่าเป็น จริงหรือเท็จ
    สามารถใช้ตัวดำเนินการเปรียบเทียบเช่นเครื่องหมายมากกว่า (>) เพื่อดูว่านิพจน์ (หรือตัวแปร) เป็นจริงหรือไม่ */

    int x = 10;
    int y = 9;
    System.out.println(x > y); // จะส่งค่า true, เพราะ 10 มีค่ามากกว่าเลข 9
    }

}