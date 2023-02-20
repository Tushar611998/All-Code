package Recursion;

import java.util.Scanner;

public class ReturnPermutationOfString {
    public static String[] permutationOfString(String input){
        if(input.length()<=0){
            String s [] = {""};
            return s;
        }

        String smallans [] = permutationOfString(input.substring(1));
        String ans [] = new String[input.length()* smallans.length];

        int k =0;
        for(int i =0;i< smallans.length;i++){
            for(int j =0;j<= smallans[i].length() ;j++){
                ans[k] = smallans[i].substring(0,j) + input.charAt(0) + smallans[i].substring(j);
                k++;
            }
        }
        return ans;
//        String [] ans = permutationOfString(input.substring(1));
//        //  char ch = input.charAt(0);
//        String output[] = new String[ans.length*input.length()];
//
//        int k=0;
//        for(int i=0;i<ans.length;i++){
//
//            for(int j=0;j<=ans[i].length();j++){
//                output[k++] = ans[i].substring(0,j) + input.charAt(0) + ans[i].substring(j);
//            }
//        }
//
//        return output;

        // Write your code here

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans [] = permutationOfString(s);
        for(int i =0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }

}
