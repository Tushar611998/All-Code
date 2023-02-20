package Recursion;
import java.util.Scanner;
public class PrintSubsequence {

    public static void printSubsequence(String str){
       printSubsequence(str,"");
    }
    public static void printSubsequence(String str,String s){

        if(str.length()==0){
            System.out.println(s);
            return;
        }

        printSubsequence(str.substring(1),s);
        printSubsequence(str.substring(1),s + str.charAt(0));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s = sc.next();
        printSubsequence(s);
    }

}
