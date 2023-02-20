package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DiffWayToWriteRegex {
    public static void main(String[] args) {
        // 1 st way to find regex
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("as");
        boolean b = m.matches();
        System.out.println(b);

        // 2nd method
        boolean b1 = Pattern.compile(".s").matcher("as").matches();
        System.out.println(b1);

        // 3rd way
        boolean b2 = Pattern.matches(".s","as");
        System.out.println(b2);


    }
}
