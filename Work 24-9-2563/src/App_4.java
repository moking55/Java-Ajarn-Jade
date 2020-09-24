import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App_4 {
    public static Integer findMin(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Integer.MAX_VALUE;
        }
        List<Integer> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist);
        return sortedlist.get(0);
    }

    public static Integer findMax(List<Integer> list) {

        if (list == null || list.size() == 0) {
            return Integer.MIN_VALUE;
        }
        List<Integer> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist);
        return sortedlist.get(sortedlist.size() - 1);
    }

    public static void main(String[] args) {
        Scanner ScanObj = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.println("ตัวเลขที่ 1 :");
        list.add(ScanObj.nextInt());
        System.out.println("ตัวเลขที่ 2 :");
        list.add(ScanObj.nextInt());
        System.out.println("ตัวเลขที่ 3 :");
        list.add(ScanObj.nextInt());
        System.out.println("ตัวเลขที่ 4 :");
        list.add(ScanObj.nextInt());

        System.out.println("ค่าต่ำสุด: " + findMin(list));
        System.out.println("ค่าสูงที่สุด: " + findMax(list));
    }
}
