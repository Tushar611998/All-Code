package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int input){
        if(input ==0){
            return 0;
        }

        int smallans = sumOfDigits(input/10);
        return smallans+input%10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int ans = sumOfDigits(input);
        System.out.println(ans);
    }
}
