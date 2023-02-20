package Recursion;
import java.util.Scanner;
public class PrintKeypad {

    public static void printKeypad(int n){
        printKeypad(n , "");

    }
    public static void printKeypad(int n , String s){

        if(n==0){
            System.out.println(s);
            return;
        }

        char help[] = helper(n%10);
        printKeypad(n/10,help[0]+s);
        printKeypad(n/10,help[1] + s);
        printKeypad(n/10,help[2]+s );
        if(help.length==4){
            printKeypad(n/10,help[3]+s );
        }

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
        int n = sc.nextInt();
        printKeypad(n);
    }
}
