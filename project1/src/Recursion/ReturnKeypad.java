package Recursion;
import java.util.Scanner;
import java.util.Arrays;
public class ReturnKeypad {

    public static String[] returnKeypad(int n) {
        if (n == 0) {
            String ans[] = {""};
            return ans;
        }

        String[] smallans = returnKeypad(n / 10);
        char [] help = helper(n % 10);
        String[] ans;

        ans = new String[help.length * smallans.length];

        int k =0;
        for(int i =0;i< smallans.length;i++){
            ans [k] = smallans[i];
            k++;
        }
        k=0;
        for(int i =0;i< smallans.length && k < ans.length;i++) {
            for (int j = 0; j < help.length ; j++) {
                ans[k] = smallans[i] + help[j];
                k++;
            }
        }

        return ans;


    }

    private static char[] helper(int n) {
        String arr = "abcdefghijklmnopqrstuvwxyz";
        char s[] = arr.toCharArray();
        char ans [];
        if(n==7 || n ==9){
            ans = new char[4];
        }
        else{
            ans = new char [3];
        }

        boolean b;
        if (n < 10)
            b = true;
        switch (n) {
            case 2:
                for (int i = 0; i < ans.length; i++) {
                    ans[i] =s[i];

                }
                break;
            case 3:
                for (int i = 3, j = 0; j < ans.length; i++, j++) {
                    ans[j] = s[i];

                }
                break;
            case 4:
                for (int i = 6, j = 0; j < ans.length; i++, j++) {
                    ans[j] = s[i];
                }
                break;
            case 5:
                for (int i = 9, j = 0; j < ans.length; i++, j++) {
                    ans[j] = s[i];
                }
                break;
            case 6:
                for (int i = 12, j = 0; j < ans.length; i++, j++) {
                    ans[j] = s[i];
                }
                break;
            case 7:
                for (int i = 15, j = 0; j < ans.length; i++, j++) {
                    ans[j] = s[i];
                }
                break;
            case 8:
                for (int i = 19, j = 0; j < ans.length; i++, j++) {
                    ans[j] =s[i];
                }
                break;
            case 9:
                for (int i = 22, j = 0; j < ans.length; i++, j++) {
                    ans[j] = s[i];
                }
                break;
        }
        return ans;
        }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        helper(5);
        int n = sc.nextInt();
        String[] ans = returnKeypad(n);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}


