package TimeComplexity;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {
    public static int tripletSum(int[] arr, int num) {
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length-1; i++) {
            int r = arr.length - 1;
            int l = i + 1;
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] == num) {
                    count = count + 1;

                    r--;

                } else if (arr[i] + arr[l] + arr[r] > num) {
                    r--;
                } else {
                    l++;
                }
            }
        }

        // for(int i =0;i<arr.length-2;i++){
        //     for(int j =i+1;j<arr.length-1;j++){
        //         for(int k =j+1;k<arr.length;k++){
        //             if(arr[i] + arr[j] + arr[k] == num ){
        //                 count = count + 1;
        //             }
        //         }
        //     }
        // }
        return count;

        //Your code goes here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans[] = new int[0];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            ans = new int[n];
            for (int j = 0; j < ans.length; j++) {
                ans[j] = sc.nextInt();
            }

        }
        int d = sc.nextInt();
        int a =tripletSum(ans, d);
        System.out.println(a);


    }
}
