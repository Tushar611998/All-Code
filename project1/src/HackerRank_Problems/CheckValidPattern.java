package HackerRank_Problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int iterations = sc.nextInt();
        for(int i =0;i<iterations;i++) {
            String s = sc.next();
            if (Character.isDigit(s.charAt(0))) {
                System.out.println("Invalid");
//                break;
            }
            if (s.length() < 8) {
                System.out.println("Invalid");
//                break;
            }
            Pattern pattern = Pattern.compile("[a-zA-z0-9_]");
            Matcher matcher = pattern.matcher(s);
            boolean ans = matcher.find();
            if (ans) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
