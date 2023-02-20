package Recursion;

import java.util.Scanner;

public class PrintPermutationsOfString {
    public static void FindPermutations(String str,String ans){
        if(str.length()<=0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            FindPermutations(str.substring(0,i) + str.substring(i+1),ans+str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        FindPermutations(s,"");
    }
}
