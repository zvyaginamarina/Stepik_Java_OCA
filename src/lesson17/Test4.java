package lesson17;

public class Test4 {

    public static boolean compareStr(StringBuilder s1, StringBuilder s2) {
        if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hi!");
        StringBuilder s2 = new StringBuilder("Hi!");
        StringBuilder s3 = s1;
        System.out.println(compareStr(s1, s2));
        System.out.println(compareStr(s1, s3));
    }
}
