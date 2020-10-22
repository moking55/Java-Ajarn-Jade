package app;

public class App4 {
    public static void main(String[] args) {
        int[] array1 = { 2, 4, 6, 8, 10 };

        int[] array2 = array1;
        array1[0] = 200;
        array2[4] = 1000;

        System.out.println("The content of array1:");
        for (int index = 0; index < array1.length; index++)
            System.out.println(array1[index] + "");
        System.out.println();
        System.out.println("The content of array2:");
        for (int index = 0; index < array2.length; index++)
            System.out.println(array2[index] + " ");
        System.out.println();
    }
}