package Graphs_1;

import java.io.IOException;
import java.util.Scanner;

public class HasPath {
    public static void main(String[] args) throws NumberFormatException, IOException {

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int arr[][] = new int[v][v];
        for(int i =0;i<e;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr[start][end] = 1;
            arr[end][start] = 1;
        }
        boolean ans[] = new boolean[arr.length];

        boolean p = isPath(arr,a,b,ans);
        System.out.println(p);

        /* Write Your Code Here
         * Complete the Rest of the Program
         * You have to take input and print the output yourself
         */

    }
    public static boolean isPath(int arr[][],int a,int b, boolean ans[]){
        if(arr[a][b]==1){
            return true;
        }
        Queue<Integer> q = new Queue<>();
        q.enqueue(a);
        ans[a] =true;
        while(!q.isEmpty()){
            int n = q.dequeue();
            for(int i =0;i<arr.length;i++){
                 if(arr[n][i]==1 && !ans[i]){
                     q.enqueue(i);
                     ans[i] = true;
                 }
            }
        }
        if(ans[b]){
            return  true;
        }else{
            return  false;
        }

    }
}
