package Recursion;
import java.util.Scanner;
public class AllCodes_String {
    public static String[] getCode(String input) {

// Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S.
// Write a program to return the list of all possible codes that can be generated from the given string.
        //input string does not contain 0s.

        // base case = if length of string less than or equal to 0 then it returns a string with empty element
        if (input.length()<= 0) {
            String ans[] = {""};
            return ans;
        }
        // now we are converting 1st dogit from String character to int (char - char = int)>>using operator

        // we have two choices  1)provide single digit as input
        //                      2) provide two digits as input

        // 1)provide single digit as input :
        int firstDigit = input.charAt(0) - '0';

        // callong recursion for 1 digit number
        String smallans1[] = getCode(input.substring(1));
        String smallans2 [] = new String [0];

        //2) provide two digits as input:
        int firstTwoDigits = 0;

        if(input.length()>=2){
            firstTwoDigits = (input.charAt(0)-'0') * 10 + (input.charAt(1)-'0');
            if(firstTwoDigits>10 && firstTwoDigits<=26){
                // calling recursion for 2nd time for 2 digit numbers
                smallans2 = getCode(input.substring(2));
            }
        }

        String ans [] = new String [smallans1.length + smallans2.length];
        int k =0;
        for(int i=0;i<smallans1.length;i++){
            ans[k] = (char)('a' + firstDigit -1) + smallans1[i];
            k++;
        }
        for(int i=0;i< smallans2.length;i++){
            ans[k] = (char)('a' + firstTwoDigits - 1) + smallans2[i];
            k++;
        }

        return ans;





    }


    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        String s = sc.next();
        String a[] = getCode(s);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
//        System.out.println((char) ('a' + 10));
        }

    }
}



