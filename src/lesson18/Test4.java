package lesson18;

public class Test4 {
    public static void main(String[] args) {
        int[] array1 = { 8, 9, -6, 0, 1, 4, 1, 7 };
        int[] array2 = { 8, 9, -6, 0, 1, 4, 1, 7 };
        int[] array3 = array2;

        System.out.println(array1 == array2);
        System.out.println(array1.equals(array2));
        System.out.println(array2.equals(array3));
    }

}
