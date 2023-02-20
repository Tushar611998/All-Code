package Strings;
import java.util.Scanner;
public class reverseEachWord {
    public static String reverseEachWord(String str) {
        String s = "";
        int currentwordstart = 0;
        int i = 0;

        for (;i <str.length();i++){
            if( str.charAt(i)==' '){
                int currentwordend = i-1;
                String reversedword ="";
                for (int j =currentwordstart;j<=currentwordend;j++){
                    reversedword = str.charAt(j) + reversedword;
                }
                s = s + reversedword + " ";
                currentwordstart = i+1;
            }
        }
        int currentwordend = i-1;
        String reversedword ="";
        for (int j =currentwordstart;j<=currentwordend;j++){
            reversedword = str.charAt(j) + reversedword;
        }
        s = s + reversedword + " ";
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String l = reverseEachWord(str);
        System.out.println(l);

    }


}
