package Recursion;

import java.util.Scanner;

public class FirstIndex {

    public static int firstIndex(int input[],int startIndex, int x){
        int smallans;
        if(startIndex == input.length-1) {
            return -1;
        }
        if(input[startIndex]==x){
            return startIndex;
        }
        else{
        smallans = firstIndex(input,startIndex+1,x);

        }
        return  smallans ;
    }

    public static int firstIndex(int input[], int x){
        return firstIndex(input,0, x);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        int ans = firstIndex(arr,x);
        System.out.println(ans);
    }
}
