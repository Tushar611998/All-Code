package Recursion;
import java.util.Scanner;
public class ReturnSubsetsSumK {

    public static int[][] subsetsSumK(int[] input, int k) {
        return subsetsSumK(input,k,0);

        // Write your code here

    }
    public static int[][] subsetsSumK(int input[], int k,int si){

        if(si == input.length){
            int arr[][];
            if(k==0){
                arr = new int[1][0];
            }
            else{
                arr= new int [0][0];
            }
            return arr;
        }

        int temp1 [][] = subsetsSumK(input,k - input[si],si + 1);
        int temp2 [][] = subsetsSumK(input,k,si + 1);

        int output[][] = new int[temp1.length + temp2.length][];
        int n =0;

        for(int i =0;i<temp2.length;i++){
            output[n] = new int[temp2[i].length];
            for(int j =0;j<temp2[i].length;j++){

                output[i][j] = temp2[i][j];
            }
            n++;

        }

        for(int i =0;i<temp1.length;i++){
            output[n] = new int[temp1[i].length + 1];
            output[n][0] = input[si];
            for(int j =1;j<= temp1[i].length;j++){

                output[n][j] = temp1[i][j-1];
            }
            n++;
        }




        return output;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int x = sc.nextInt();
        int [][] ans = subsetsSumK(arr,x);
        for(int i=0;i<ans.length;i++){
            for(int j =0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
