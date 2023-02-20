package Recursion;

import java.util.Scanner;

public class LastIndex {

    public static int LastIndex(int input[],int x){
        return LastIndex(input,input.length-1,x);
    }
    private static int LastIndex(int input[],int endIndex,int x){
        int smallans;
        if(input[endIndex]==x){
            return endIndex;
        }
//        if(input[0]==x){
//            return 0;
//        }
        if(endIndex==0){
            return -1;
        }

        else{
            smallans = LastIndex(input,endIndex-1,x);
        }
        return smallans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        int ans = LastIndex(arr,x);
        System.out.println(ans);

    }

}
