package Recursion;
import java.util.Scanner;
public class ReturnSubsetOfArray {

    public static int[][] subsets(int input[],int startIndex) {
        if(startIndex==input.length){
            int ans [][] = new int[1][0];
            return ans;
        }


        int smallans [][] = subsets(input,startIndex+1);


        int ans [][] = new int[2 * smallans.length][];

        int k =0;
        for(int i=0;i< smallans.length;i++){
            ans[k] = new int[smallans[i].length];
            for(int j =0;j<smallans[i].length;j++){
                ans[k][j] = smallans[i][j];
            }
            k++;
        }
        for(int i= 0;i< smallans.length;i++){
            ans[k] = new int[smallans[i].length + 1];
            ans[k][0] = input[startIndex];
            for(int j =1;j<=smallans[i].length;j++){
                ans[k][j] =smallans[i][j-1];
            }
            k++;
        }
        return ans ;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int [][] ans = subsets(arr,0);
        for(int i=0;i<ans.length;i++){
            for(int j =0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
