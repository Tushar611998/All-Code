package Recursion;
import java.util.Scanner;
public class ReplaceCharacter {
    public static String replaceCharacter(String input, char c1, char c2){

        if(input.length()==0){

            return input;
        }
        String b = "";
        if(input.charAt(0)==c1){
            b=b+c2;
        }
        else{
            b = b + input.charAt(0);
        }
        String smallans = replaceCharacter(input.substring(1),c1,c2);
        smallans = b + smallans;
        return smallans;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        String s1 = replaceCharacter(s,c1,c2);
        System.out.println(s1);
    }
}
