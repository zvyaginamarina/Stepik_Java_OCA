package lesson18;

public class Test6 {
    public static void main(String[] args) {
        char[] array = { 'h', 'e', 'l', 'l', 'o', '!' };
        String s = new String(array);
        System.out.println(s);

        StringBuilder sb1 = new StringBuilder("ok");
        sb1.append(array, 2, 3);
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("ok");
        sb2.insert(1, array, 2, 3);
        System.out.println(sb2);
    }

}
