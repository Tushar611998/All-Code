package Recursion;
import java.util.Scanner;
public class PrintSubsetOfArray {
    public static void printSubset(int input[],int startIndex,int arr[]){
        if(startIndex ==input.length){
            for(int i =0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }

        printSubset(input,startIndex+1,arr);
        int newarr []  = new int [arr.length+1];
        int i =0;

        for(;i<arr.length ;i++){
            newarr[i] = arr[i];
        }
            newarr[i] = input[startIndex];
        printSubset(input,startIndex+1,newarr);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int arr2 [] = new int[0];
        printSubset(arr,0,arr2);
    }

}
