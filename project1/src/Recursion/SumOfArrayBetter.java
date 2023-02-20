package Recursion;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class SumOfArrayBetter {

    // this program will give simillar output as SumOfArray only the differece is :
    // thid program won't consume more space as we won't create new array of size length-1
// we are just moviing our cursor to next inxdex

    public static int SumOfArrayBetter(int arr[],int startIndex){

        if(startIndex == arr.length-1){
            return arr[startIndex] ;
        }

        int smallans = SumOfArrayBetter(arr,startIndex+1);
        return arr[startIndex] + smallans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int ans = SumOfArrayBetter(arr,0);
        System.out.println(ans);
    }
}
