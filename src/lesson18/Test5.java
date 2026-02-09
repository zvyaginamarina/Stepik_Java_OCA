package lesson18;

public class Test5 {
    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimal element: " + min + " Maximum element: " + max);

    }

    public static void main(String[] args) {
        double[] array1 = { -1.1, 3.14, 0, -8.0, 9.16, 15.3 };
        maxMin(array1);
    }

}
