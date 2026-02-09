package lesson17;

public class Test5 {

    public static boolean compStr(StringBuilder s1, StringBuilder s2) {
        boolean result = true;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hi!");
        StringBuilder s2 = new StringBuilder("Hi");
        StringBuilder s3 = s1;
        System.out.println(compStr(s1, s2));
        System.out.println(compStr(s1, s3));
        System.out.println(compStr(new StringBuilder(""), new StringBuilder("1")));
    }

}
