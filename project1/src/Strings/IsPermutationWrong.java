package Strings;
import java.util.Scanner;
public class IsPermutationWrong {
    public static boolean isPermutation(String str1, String str2) {
        // fristly we check the length of both strings are equal or not
        if (str1.length() != str2.length()) {
            return false;
        }
        // creating new empty string
        String str = "";
        //selecting character one by one from one string and cheching in another string
        for (int i = 0; i < str1.length(); i++) {

            for (int j = 0; j < str2.length(); j++) {
                // if char in str1 matches with char in str2 then we append char in empty string
                if (str1.charAt(i) == str2.charAt(j)) {
                    str = str + str1.charAt(i);
                    break;

                }                            // this program is partially correct some test cases fails
            }                                // str1 = aba   str2 = bab  in that test case this program fails
        }                                    // this error will corrected in next version of this program
        // checking here the newly created (appended) string is equal to str1
        if (str.equals(str1)) {
            return true;
        }
        return false;


        //Your code goes here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(isPermutation(str1, str2));
    }


}
