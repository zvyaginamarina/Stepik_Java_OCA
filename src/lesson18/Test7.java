package lesson18;

public class Test7 {
    public static void sortOrder(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;

                }

            }

            System.out.println(array[i]);
        }

    }

    public static void main(String[] args) {
        int[] array = { 4, 9, 15, 2, 0, 154, 1 };

        sortOrder(array);
    }
}
