package Recursion;
import java.util.Scanner;
public class SumOfArray {

    public static int sum(int input[]){

        if(input.length==1){
            return input[input.length-1];
        }
        int arr [] = new int[input.length-1];
        for(int i =0;i<arr.length;i++){
            arr[i] = input[i];

        }

        int smallans = sum(arr);
        return input[input.length-1] + smallans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        int a = sum(arr);
        System.out.println(a);
    }


}
