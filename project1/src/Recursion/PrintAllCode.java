package Recursion;
import java.util.Scanner;
public class PrintAllCode {

    public static void printAllPossibleCodes(String input) {
//        String s = "";
        printAllPossibleCodes(input,"");
        return;

        // Write your code here

    }
    public static void printAllPossibleCodes(String input,String s) {
        if(input.length()<=0){
            System.out.println(s);
            return;
        }
        int firstDigit = input.charAt(0)-'0';
//        for(int i=0;i<input.length();i++){
            s = s + (char)('a' + firstDigit -1);

//        }
        printAllPossibleCodes(input.substring(1),s);
        int firstTwoDigits = 0;

        if(input.length()>=2){
            firstTwoDigits = (input.charAt(0)-'0') * 10 + (input.charAt(1)-'0');
            if(firstTwoDigits>10 && firstTwoDigits<=26){
                String s1 ="";
                for(int i=0;i<s.length()-1;i++){
                    s1 = s1 + s.charAt(i);
                }

                s1 =s1+ (char)('a' + firstTwoDigits - 1);
                // calling recursion for 2nd time for 2 digit numbers
                printAllPossibleCodes(input.substring(2),s1);

            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        String s = sc.next();
        printAllPossibleCodes(s);
    }
}
