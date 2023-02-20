package Recursion;
import java.util.Scanner;
public class CheckNumber {

    public static boolean checkNumber(int arr[], int x){
        if(arr.length ==1){
            if(arr[0]==x){
                return true;
            }
            else{
                return false;
            }
        }
        int arr1[] = new int[arr.length-1];
        for(int i =0;i <arr1.length;i++){
            arr1[i]= arr[i];
        }
        boolean smallans = checkNumber(arr1,x);
        if(arr[arr.length-1]==x){
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

        int arr [] = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        int x = sc.nextInt();
        boolean a = checkNumber(arr,x);
        System.out.println(a);

    }
}
