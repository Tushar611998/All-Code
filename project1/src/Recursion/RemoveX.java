package Recursion;
import java.util.Scanner;
public class RemoveX {
    public static String removeX(String input){
        return removeX(input,0);
    }
    private static String removeX(String input,int startIndex){

        if(startIndex==input.length()-1 && input.charAt(input.length()-1)!='x'){
            String s = "";
            s= input.charAt(input.length()-1)+s;
            return s;
        }
        if(startIndex==input.length()-1 && input.charAt(input.length()-1)=='x'){
            String s = "";

            return s;
        }

        String smallans = removeX(input, startIndex+1);
        if(input.charAt(startIndex)=='x'){
            smallans = removeX(input, startIndex+1);

        }
        else{
            smallans = input.charAt(startIndex)+ smallans;
        }
        return smallans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        String ans = removeX(s);
        System.out.println(ans);

    }
}
