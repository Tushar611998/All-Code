package codeStudio;
import java.util.Scanner;

public class pairSum_return2DArray {
    public static int[][] pairSum(int[] arr, int s) {
        int ans [][] =  new int[0][2];

        for(int i = 0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp [][] = ans;
                if(arr[i]+arr[j]==s){
                    ans = new int[ans.length+1][2];
                    int k = 0;
                    for(int p = 0;p< temp.length;p++){
                        for(int q=0;q<temp[p].length;q++){
                            ans[k][q]=temp[p][q];
                        }
                        k++;
                    }
                    ans[k][0] = arr[i];
                    ans[k][1] = arr[j];
                }
            }
        }
        return ans;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        int s = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int ans [][]= pairSum(arr,s);
//        int n [][] = {{1,2},{2,3},{4,5}};
//        int temp [][] = n;


        for(int i=0;i<ans.length;i++){
            for(int j = 0;j<ans[i].length;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

    }
}
