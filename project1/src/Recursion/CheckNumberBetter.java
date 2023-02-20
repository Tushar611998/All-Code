package Recursion;

import java.util.Scanner;

public class CheckNumberBetter {

    // this program will give simillar output as SumOfArray only the differece is :
    // thid program won't consume more space as we won't create new array of size length-1
// we are just moviing our cursor to next inxdex

    public static boolean CheckNumberBetter(int arr[],int startIndex,int x){

        if(startIndex==arr.length-1){
            if(arr[startIndex]==x){
                return true;
            }
            else{
                return false;
            }
        }
        boolean smallans = CheckNumberBetter(arr,startIndex+1,x);
        if(arr[startIndex]==x){
            return true;
        }
        if(!smallans){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [ ] = new int[n];
        for(int i =0;i <arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        boolean ans = CheckNumberBetter(arr,0,x);
        System.out.println(ans);
    }

}
