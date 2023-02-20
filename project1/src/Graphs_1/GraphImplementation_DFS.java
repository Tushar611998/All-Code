package Graphs_1;

import java.util.Scanner;

public class GraphImplementation_DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i =0;i<e;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();

            arr[start][end] = 1;
            arr[end][start] = 1;
        }
        print(arr);
    }
    public static void printHelper(int arr[][],int start, boolean ans[]){
        // depth first way of printing edges
        System.out.println(start);
        ans[start] = true;

        for(int i=0;i<arr.length;i++){
            if(arr[start][i] ==1 && ans[i]!=true){
                printHelper(arr,i,ans);
            }
        }
    }
    public static void print(int arr[][]){
        boolean ans[] = new boolean[arr.length];
        for(int i =0;i<ans.length;i++){
            if (!ans[i]){
                printHelper(arr,i,ans);
            }
        }
    }
}
