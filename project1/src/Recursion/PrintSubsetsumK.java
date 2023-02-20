package Recursion;
import java.util.Scanner;

public class PrintSubsetsumK {

    public static void printSubsetsSumTok(int input[], int k) {
        int arr[] = new int[0];
        printSubsetsSumTok(input, k, arr, 0);
        return;
        // Write your code here
    }

    public static void printSubsetsSumTok(int input[], int k, int arr[], int si) {

        if (si == input.length) {
            if (k == 0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                return;
            } else {
                return;
            }
        }

        printSubsetsSumTok(input, k, arr, si + 1);


        int newarr[] = new int[arr.length + 1];

        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            newarr[n] = arr[i];
            n++;
        }
        newarr[n] = input[si];
        printSubsetsSumTok(input, k - input[si], newarr, si + 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        printSubsetsSumTok(arr,k);

    }

}
