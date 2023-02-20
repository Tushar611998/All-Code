package LeetCode.Strings;
import java.util.*;

public class LongestPrefixString {
    public static String longestCommonPrefix(String[] strs) {
        String ans =strs[0];
        for(int i=1;i<strs.length;i++){
            String a ="";
            int j =0;
            while(j<ans.length() && j<strs[i].length()){
                if(strs[i].charAt(j)==ans.charAt(j)){
                    a+=strs[i].charAt(j);
                }else{
                    break;
                }
                j++;
            }
            if(a.length()==0){
                return "";
            }
            ans = "";
            ans+=a;
        }
        return ans;

    }

    public static void main(String[] args) {
//        String[] a =  {"rajasthan","rajratan","raja","rajan","rajkul","rajvat","rajvanshi"};
        String[] a =  {"hentai","cartoon","carnival","camera","coding","rakulprit","raman"};
        String ans =longestCommonPrefix(a);
        System.out.println(ans);
    }
}
