package Strings;
import java.util.Scanner;
public class REverseString01 {
    public static String reversedString(String str) {
        String reversedString = " ";
        for (int i = 0;i<str.length();i++){

            reversedString = str.charAt(i)+ reversedString;

        }
        return reversedString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = reversedString(str);
        System.out.println(s);

    }

}
