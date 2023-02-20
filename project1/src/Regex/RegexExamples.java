package Regex;

import java.util.HashMap;
import java.util.regex.Pattern;

public class RegexExamples {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s","as"));
        System.out.println(Pattern.matches(".s","ak"));
        System.out.println(Pattern.matches(".s","ass"));
        System.out.println(Pattern.matches("..s","ass"));
        System.out.println(Pattern.matches("s","as"));

//        HashMap<Integer,Integer> p = new HashMap<>();
//        p.re
    }
}
