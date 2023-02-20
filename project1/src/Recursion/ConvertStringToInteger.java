package Recursion;
import java.util.Scanner;
public class ConvertStringToInteger {
    public static int convertStringToInt(String input){
        return convertStringToInt(input,0);
    }
    public static int convertStringToInt(String input, int startIndex){
        if(Character.isDigit(input.charAt(startIndex))){
            int a = Integer.valueOf(input);
            return a;

        }
        if(startIndex==input.length()){
            return -1;
        }

        int smallans = convertStringToInt(input, startIndex+1);
        return smallans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = convertStringToInt(s);
        System.out.println(a);
    }
}
