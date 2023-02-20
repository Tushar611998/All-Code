package LeetCode.Arrays;

import java.util.Scanner;

public class UniqueNo {
    public static void unique(int arr[]){
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]==0){
                    break;
                }else if(arr[i] ==arr[j]){
                    arr[i] =0;
                    arr[j] = 0;

                }
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i] !=0){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        unique(arr);
    }
}
