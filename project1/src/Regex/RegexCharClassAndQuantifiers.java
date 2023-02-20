package Regex;

import java.util.regex.Pattern;

public class RegexCharClassAndQuantifiers {
    public static void main(String[] args) {
        System.out.println("? Quantifier .....");
        //a or b or s comes only one times
        System.out.println(Pattern.matches("[absmn]?","mpd"));

        System.out.println("+ Quantifier .....");
        // character or charters occures once or more than one times
        System.out.println(Pattern.matches("[absd]+","aaaassdddddbbbb"));
        System.out.println(Pattern.matches("[absd]+","absd"));

        System.out.println("* Quantifiers ....");
        // characer comes zero or more times
        System.out.println(Pattern.matches("[absd]*","aaabddbp"));
    }
}
