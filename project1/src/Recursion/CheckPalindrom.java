package Recursion;
import java.util.Scanner;
public class CheckPalindrom {

    public static boolean isStringPalindrome(String input) {

        return isStringPalindrome( input, 0);
    }
    public static boolean isStringPalindrome(String input, int startIndex) {
        if (input.length() <= 1) {
            return true;
        }
        if (startIndex == input.length() / 2) {
            return false;
        }

        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return isStringPalindrome(input.substring(1, input.length() - 1));

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ans = isStringPalindrome(s);
        System.out.println(ans);
    }


}
