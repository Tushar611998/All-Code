package FinalTest_1;

import java.util.Locale;
import java.util.Scanner;

public class Panagram {
    public static void ans(int n, String str) {

        int arr[] = new int[123];
        String ans =str.toLowerCase();

        for(int i=0;i<ans.length();i++){
            arr[(int)ans.charAt(i)]++;
//            arr[(int)'a']= arr[(int)'a']++;
        }

        for(int i =97;i<123;i++){
            if(arr[i]==0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        //Write your code here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ans(s.length(),s);
    }
}
