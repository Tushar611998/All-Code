package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class IsPermutationRight {
    public static boolean isPermutation(String str1, String str2) {
        // firstly checking the lengh of both strings are equal or not
        if (str1.length() != str2.length()) {
            return false;
        } else {
            // then we convert strings into character arrays
            char a[] = str1.toCharArray();
            char b[] = str2.toCharArray();

            // now sorting character arrays e. g = a c b d  ----> a b c d

            Arrays.sort(a);
            Arrays.sort(b);

            // checking both sorted strings containing same characters or not
            // if both strings contains same characters then they are permutations else not permutations
            for (int i = 0; i < a.length; i++) {
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
