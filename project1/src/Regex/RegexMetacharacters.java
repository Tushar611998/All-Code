package Regex;

import java.util.regex.Pattern;

public class RegexMetacharacters {
    public static void main(String[] args) {
        System.out.println("Regex Metacharacter d....");// d is for Digits
        System.out.println(Pattern.matches("\\d","5"));

        System.out.println("Metacharacter D");// D for Non Digits
        System.out.println(Pattern.matches("\\D","1"));

        System.out.println("Regex Metacharacter s....");// s for any whitespace characters like \n,\t,\s,\f,\r
        System.out.println(Pattern.matches("\\s","\t"));

        System.out.println("Regex Metacharacter S....");//for any Nonwhitespace character
        System.out.println(Pattern.matches("\\S"," "));

        System.out.println("Regex Metacharacter w....");// Any word character form a-zA-Z0-9
        System.out.println(Pattern.matches("\\w","T"));

        System.out.println("Regex Metacharacter W....");// for any non word character
        System.out.println(Pattern.matches("\\W","$"));

        System.out.println("Regex Metacharacter b...");// used for finding the bounded word
        System.out.println(Pattern.matches("\\bjava\\b","j"));

        System.out.println("Regex Metacharacter B....");// used for non bounded word
        System.out.println(Pattern.matches("\\B","v"));
    }
}
