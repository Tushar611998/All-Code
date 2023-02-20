package Strings;
import java.util.Scanner;
public class getCompressedString {
    public static String getCompressedString(String str) {
        String ans = "";
        ans = ans +str.charAt(0);
        int count =1;
        for (int i =1;i < str.length();i++){

            if (str.charAt(i)== str.charAt(i-1)){
                count = count +1;
            }
            else if (count >1){
                ans = ans + count;
                count =1;
            }
            if(str.charAt(i)!= str.charAt(i-1)){
                ans = ans + str.charAt(i);
            }

        }
        if (count>1){
            ans = ans +count;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String l = getCompressedString(str);
        System.out.println(l);
    }

}
