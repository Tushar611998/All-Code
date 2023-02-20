package Recursion;
import java.util.Scanner;
public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String s) {
        return removeConsecutiveDuplicates(s, 0);
    }
    private static String removeConsecutiveDuplicates(String s,int startIndex){


        if(startIndex==s.length()-1  ){
            String a = "";
            a = a + s.charAt(s.length()-1);
            return a;
        }
        String smallans = removeConsecutiveDuplicates(s,startIndex+1);
        if(s.charAt(startIndex)!=s.charAt(startIndex+1)){
            smallans = s.charAt(startIndex) + smallans;
        }

        return smallans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = removeConsecutiveDuplicates(s);
        System.out.println(ans);
    }
}
