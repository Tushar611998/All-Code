package Recursion;
import java.util.Scanner;
public class CheckSortedBetter {

    // this program will give simillar output as checkSorted only the differece is :
    // thid program won't consume more space as we won't crreate new array of size length-1
// we are just moviing our cursor to next inxdex

    public static boolean checkSortedBetter(int arr[],int startIndex){
        if(startIndex >=arr.length-1){
            return true;
        }
        if(arr[startIndex]>arr[startIndex+1]){
            return false;
        }

        boolean smallans = checkSortedBetter(arr,startIndex+1);
        return smallans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int arr[]= {1,2,4,5,1};
        boolean ans = checkSortedBetter(arr,0);
        System.out.println(ans);
    }
}



