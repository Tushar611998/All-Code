package Recursion;

import java.util.Scanner;

public class ReplacePi {
    public static String ReplacePi(String input){
        return ReplacePi(input,0);
    }
    private static String ReplacePi(String input,int startIndex){
        if(startIndex ==input.length()-1){
            return input;
        }
        if(input.charAt(startIndex)=='p' && input.charAt(startIndex+1)=='i'){
            String ans = input.replace("pi","3.14");
            return ans;

        }
        String smallans = ReplacePi(input,startIndex+1);
        return smallans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss = ReplacePi(s);
        System.out.println(ss);

    }
}
