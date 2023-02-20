package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFindeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pattern p = Pattern.compile("java");
        Matcher m = p.matcher("yhis is new java program that creates java file and compiled by java jdk");
        boolean found = false;
        while (m.find()){
            System.out.println(" i found word "+ m.group() +" starts at "+ m.start()+" ends at "+m.end());
        }
    }
}
