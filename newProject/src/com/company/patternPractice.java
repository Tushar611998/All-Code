package com.company;
import java.util.Scanner;

public class patternPractice {
    public static boolean checkMember(int n) {

        int i = 0;
        int j = 1;
        while (i < n) {

            int k = i + j;
            i = j;
            j = k;
        }
        if (i == n) {

            return true;
        } else {

            return false;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean a=checkMember(n);
        System.out.println(a);
    }




        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

    }





















