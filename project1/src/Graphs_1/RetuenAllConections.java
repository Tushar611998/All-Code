package Graphs_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RetuenAllConections {
    public static void main(String[] args) throws NumberFormatException, IOException {

        Scanner sc = new Scanner (System.in);
        int v= sc.nextInt();
        int e = sc.nextInt();
        int arr[][] = new int[v][v];
        for(int i =0;i<e;i++){
            int sv = sc.nextInt();
            int ev = sc.nextInt();
            arr[sv][ev] = 1;
            arr[ev][sv] =1;

        }
        ArrayList<ArrayList<Integer>> ans = allConected(arr);
        for(int i =0;i<ans.size();i++){

            Collections.sort(ans.get(i)) ;
            for(int j =0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }



        /* Write Your Code Here
         * Complete the Rest of the Program
         * You have to take input and print the output yourself
         */
    }
    public static ArrayList<ArrayList<Integer>> allConected(int arr[][]){
        boolean visited []= new boolean[arr.length];
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if( !visited[i]){
                ArrayList<Integer> smallAns = allConectedHelper(arr,i,visited,a);
                ans.add(smallAns);
                a= new ArrayList<>();
            }
        }
        return ans;


    }

    public static ArrayList<Integer> allConectedHelper(int arr[][], int s, boolean[]visited, ArrayList<Integer> a){
        a.add(s);
        visited[s] = true;
        for(int i =0;i<arr.length;i++){
            if(arr[s][i] ==1 && !visited[i]){
                ArrayList<Integer> b =allConectedHelper(arr,i,visited,a);
                return b;
            }

        }
        return a;
    }
}
