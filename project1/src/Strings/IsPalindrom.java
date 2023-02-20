package Strings;
import java.util.Scanner;
public class IsPalindrom {
    public static boolean ChechPalindrom(String str) {

        for (int i = 0;i<str.length()/2;i++){
            if ((str.charAt(i))==(str.charAt(str.length()-1-i))){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ChechPalindrom(str));


    }

}
