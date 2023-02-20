package Recursion;

import java.util.Scanner;

public class AllIndicesOfNum {

    public static int[] AllIndicesOfNum(int input[], int x) {
        return AllIndicesOfNum(input, input.length-1, x);
    }

    private static int[] AllIndicesOfNum(int input[], int startIndex, int x) {
        if(input.length==0){
            return new int[0];
        }
        if(startIndex==0 && input[startIndex]==x){
            int arr[] = new int[1];
            arr[0] =startIndex;
            return arr;

        }
        if(startIndex==0){

            return new int[0] ;
        }

        int smallans[] = AllIndicesOfNum(input,startIndex-1,x);
        if(input[startIndex]==x){

            int arr [] =new int[smallans.length+1];

            for(int i =0;i< smallans.length;i++){
                arr[i]= smallans[i];
            }

            for(int i = smallans.length;i<arr.length;i++){
                arr[i]=startIndex;
            }

            return arr;
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
        int[] ans = AllIndicesOfNum(arr,x);
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]+ " ");
        }

    }
}
