package LeetCode.Strings;

import java.util.Locale;

public class CheckPallindrom {
    public static boolean isPalindrome(String s) {

//        String str1 =s.replaceAll("[-:;?/,.!@#$%^& ]","");
        String str =s.toLowerCase().replaceAll("[-:;'?/\",.*{}()!@#$%^& ]","").replaceAll("\\[","").replaceAll("\\]","");

        int i =0;
        int j =str.length()-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "0P";
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }
}
