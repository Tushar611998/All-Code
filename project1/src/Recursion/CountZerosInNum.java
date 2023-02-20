package Recursion;

import java.util.Scanner;

public class CountZerosInNum {
    public static int CountZerosInNum(int input){
        if(input ==1){
            if(input%10 ==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(input ==0){
            return 1;
        }
        int smallans = CountZerosInNum(input/10);
        if(input%10 ==0){
            return 1+smallans;
        }
        return smallans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = CountZerosInNum(n);
        System.out.println(ans);
    }
}
