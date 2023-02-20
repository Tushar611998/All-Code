package Strings;
import java.util.Scanner;
public class ReverseWordWise {
    public static String revrseWordWise(String str) {

        // the strings are immutable in nature thats why we need to covert string into strimgButffer
        // then firstly we need to reverse complete string
        // e.g string ={ abc de f gh}    &  reversed = {hg f ed cba}

//        String s = new StringBuffer(str).reverse().toString();
        String s ="";
        for(int p =0;p<str.length();p++){
            s =str.charAt(p)+s;
        }

        // then we need to swap the characters of the words for acheive only word wise reverse

        String ans ="";
        int currentstartword = 0;
        int i = 0;
        for (;i<s.length();i++){
            if(s.charAt(i)==' '){
                // we need to reverse the word and then concat it into final string
                int currentwordend = i-1;
                // we have to store one revesed word then store complete string into final string
                String reversedword ="";

                for (int j= currentstartword;j<=currentwordend;j++){
                    reversedword = s.charAt(j)+reversedword;
                }
                currentstartword = i+1;
                ans +=reversedword+" ";

                // upto this we get reversed words untill secondlast word
                // because after last word ther is not space therfore we need to write same code for last word
            }


        }
        int currentwordend = i-1;
        // we have to store one revesed word then store complete string into final string
        String reversedword ="";

        for (int j= currentstartword;j<=currentwordend;j++){
            reversedword = s.charAt(j)+reversedword;
        }
        ans +=reversedword;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String d =revrseWordWise(str);
        System.out.println(d);

    }

}
