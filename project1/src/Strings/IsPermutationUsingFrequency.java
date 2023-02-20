package Strings;

import java.util.Scanner;

public class IsPermutationUsingFrequency {
    public static boolean isPermutation(String str1, String str2) {

        // first we checking the length of string is equal or not

        if (str1.length() != str2.length()) {
            return false;
        } else {

            //we creating two random arrays of size 255 for two strings

            int a[] = new int[255];
            int b[] = new int[255];

            // storing the frequency of character in string
            // character stores its frequency at its ASCII value
            // i.e. we are checking one character comes how many times in string
            // e. g  in abcda a comes two times so it store value 2 in array a[]
            // for str1

            for (int i = 0; i < str1.length(); i++) {
                a[str1.charAt(i)]++;
            }
            //for str2

            for (int i = 0; i < str2.length(); i++) {
                b[str1.charAt(i)]++;
            }

            // comparing elements of both the arrays
            // i.e. checking frequencies of array elements are equal or not
            for (int i = 0; i < 255; i++) {
                if (a[i] != b[i]) {
                    return false;
                }

            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(isPermutation(str1, str2));
    }
}
