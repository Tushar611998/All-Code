package Regex;

import java.util.regex.Pattern;

public class _10DigitNumber {
    public static void main(String[] args) {
        /*Create a regular expression that accepts 10 digit numeric characters
 starting with 7, 8 or 9 only.*/

        //By character class and Quantifier
        System.out.println("By character class and Quantifier");
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9423732079"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","7743963889"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","6255920041"));

        //By using Regex Metacharacters
        System.out.println("By Regex Metacharacters");
        System.out.println(Pattern.matches("[789]{1}\\d{9}","7743963889"));
        System.out.println(Pattern.matches("[789]{1}\\d{9}","6255910040"));
        System.out.println(Pattern.matches("[789]{1}\\d{9}","8275326032"));
    }
}
