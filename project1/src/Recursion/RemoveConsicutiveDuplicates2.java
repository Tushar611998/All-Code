package Recursion;
import java.util.Scanner;
public class RemoveConsicutiveDuplicates2 {


    // here we solve problem without using startIndex parameter

    public static String removeDuplicates(String s){
        if(s.length()==1){
            return s;
        }

        String smallans = removeDuplicates(s.substring(1));
        if(s.charAt(0)!= smallans.charAt(0)){
            smallans= s.charAt(0) + smallans;
        }
        return smallans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "mewwhaadjoob";
        String x = removeDuplicates(s);
        System.out.println(x);
    }
}
