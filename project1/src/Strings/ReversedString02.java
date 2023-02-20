package Strings;

import java.util.Scanner;

public class ReversedString02 {public static String reversedString(String str) {
    String reversedString = " ";
    for (int i = str.length()-1;i>=0;i--){

        reversedString += str.charAt(i) ;

    }
    return reversedString;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = reversedString(str);
        System.out.println(s);

    }

}
