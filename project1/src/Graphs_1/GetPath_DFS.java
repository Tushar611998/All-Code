package Graphs_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GetPath_DFS {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);

        int v= sc.nextInt();
        int e= sc.nextInt();
        int arr[][] = new int[v][v];

        for(int i = 0;i<e;i++){
            int sv = sc.nextInt();
            int ev = sc.nextInt();

            arr[sv][ev] = 1;
            arr[ev][sv] = 1;

        }
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        ArrayList<Integer> ans = getPathDFS(arr,v1,v2);
        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }


        /* Write Your Code Here
         * Complete the Rest of the Program
         * You have to take input and print the output yourself
         */

    }
    public static ArrayList<Integer> getPathDFSHelper(int [][]arr,int s,int e,ArrayList<Integer> ans,boolean [] visited){

        if(s==e){
            ans.add(e);
            visited[e] =true;
            return ans;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[s][i]==1 && !visited[i]){
                visited[i] = true;
                visited[s] =true;
                ArrayList<Integer> smallAns = getPathDFSHelper(arr,i,e,ans,visited);
                if(smallAns.isEmpty()){
                    ArrayList<Integer> b = new ArrayList<>();
                    return b;
                }else{
                    ans.add(s);
                    break;
//                    visited[s] = true;
//                    return ans;
                }
            }
        }
        return ans;


    }
    public static ArrayList<Integer> getPathDFS(int arr[][],int s,int e){
        boolean ans[] = new boolean[arr.length];
        ArrayList<Integer> a = new ArrayList<>();
        return getPathDFSHelper(arr,s,e,a,ans);
    }
}
