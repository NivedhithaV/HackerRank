
import java.util.Scanner;

public class CircularPalindrome {

    private static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        String str = in.next();
        for (int s = 0; s < str.length(); s++) {
            if (s != 0) {
                str = str.substring(length - (length - 1)) + str.substring(0, 1);
            }
            int maxLength = 0;
            for (int i = 0; i < str.length(); i++) {
                for (int j = 1; j <= str.length() - i; j++) {
                    String subStr = str.substring(i, i + j);
                    if (isPalindrome(subStr) && subStr.length() > maxLength) {
                        maxLength = subStr.length();
                    }
                }
            }
            System.out.println(maxLength);
        }
    }
}
