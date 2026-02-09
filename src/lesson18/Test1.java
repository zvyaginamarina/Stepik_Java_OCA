package lesson18;

public class Test1 {
    public static void main(String[] args) {
        int[] array1;
        String[] array2;
        double[][] array3;
        int[][] array4;

        array1 = new int[5];
        array2 = new String[3];
        array3 = new double[4][2];
        array4 = new int[3][];

        array2[0] = "Hi";
        array2[1] = "Bye";
        array2[2] = "Ok";

        array3[0][0] = 3.14;
        array3[2][1] = 3.14;

        double[] array5;
        array5 = new double[2];
        array5[0] = 1.1;
        array5[1] = 2.1;

        array3[1] = array5;

        System.out.println(array3[1][0]);
        System.out.println(array3.length);

        int[] array6 = new int[7];
        int[] array7 = { 1, 2, 3 };

        int[] array8;
        array8 = new int[] { 1, 2, 3 };

        // нельзя
        // int [] array9;
        // array9 = {1,2,3};

        int[] array10 = new int[] { 1, 2, 3 };

        // нельзя
        // int[] array10 = new int[3] { 1, 2, 3 };
    }

}
