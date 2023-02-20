package Regex;

import java.util.regex.Pattern;

public class MakePatternExercise {
    public static void main(String[] args) {
        /*Create a regular expression that accepts alphanumeric characters only.
Its length must be six characters long only.*/

        System.out.println(Pattern.matches("[a-zA-z0-9]{7}","Tushar5"));
        System.out.println(Pattern.matches("[a-zA-z0-9]{7}","Tushar611998"));
        System.out.println(Pattern.matches("[a-zA-z0-9]{7}","Tu546BA"));
        System.out.println(Pattern.matches("[a-zA-z0-9]{7}","Tu5%$BA"));
    }
}
