package lesson18;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array1 = { 8, 9, -6, 0, 1, 4, 1, 7 };
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");

        }
        System.out.println();
        Arrays.sort(array1);

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();
        int index1 = Arrays.binarySearch(array1, 0);
        System.out.println(index1);
    }

}
