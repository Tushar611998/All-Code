package Regex;

import java.util.regex.Pattern;

public class RegularExpressionCharacterClasses {
    public static void main(String[] args) {
        // [abc] class this is simple class as check either a or b or c
        System.out.println(Pattern.matches("[abs]","a"));

        //[^abc] the any single character except abc
        System.out.println(Pattern.matches("[^abc]","a"));

        // [a-zA-Z] a through z or A through Z inclusive rage for single character
        System.out.println(Pattern.matches("[a-zA-Z]","Zz"));

        //All classesfor single charater only
        //[a-d[p-z]] a to d or f to z
        System.out.println(Pattern.matches("[a-d[p-z]]","b"));

        //[a-z&&[defg]] intersection of both ranges i.e. d,e,f,g
        System.out.println(Pattern.matches("[a-z&&[defg]]","a"));

        //[a-z&&[^defg]]  a-z except defg
        System.out.println(Pattern.matches("[a-z&&[^defg]]","h"));

        //[a-z&&[^p-t]] a to z except p to t
        System.out.println(Pattern.matches("[a-z&&[^p-t]]","c"));
    }
}
