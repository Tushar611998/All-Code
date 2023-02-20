package Graphs_1;

import java.util.Scanner;

public class Prims_Algorithm_MST {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int V = s.nextInt();
            int E = s.nextInt();

            int arr [][] = new int [V][V];
            for(int i=0;i<E;i++){
                int v1  = s.nextInt();
                int v2 = s.nextInt();
                int weight = s.nextInt();

                arr[v1][v2] = weight;
                arr[v2][v1] = weight;

            }

            prims(arr);

            /* Write Your Code Here
             * Complete the Rest of the Program
             * You have to take input and print the output yourself
             */
        }


    private static void prims(int[][] arr) {
        int v = arr.length;
        boolean visited[] = new boolean [v];
        int parent[] = new int [v];
        int weight[] = new int[v];
        parent[0] = -1;
        weight[0] = 0;
        for(int i =1;i<v;i++){
            weight[i] = Integer.MAX_VALUE;
        }
        for(int i =0;i<v;i++){
            // pick min vertex with min weight
            int minVertex = findVertex(weight,visited);
            visited[minVertex] = true;
            for(int j =0;j<v;j++){
                if(arr[minVertex][j] !=0 && !visited[j]){
                    if(arr[minVertex][j]<weight[j]){
                        weight[j] = arr[minVertex][j];
                        parent[j] = minVertex;
                    }
                }
            }

        }
//        for(int j =0;j<weight.length;j++){
//            System.out.print(weight[j] + " ");
//        }
        for(int i =1;i<v;i++){
            if(parent[i]<i){
                System.out.println(parent[i] +" " + i + " " + weight[i]);
            }else{
                System.out.println(i + " " + parent[i] + " " + weight[i]);
            }
        }

    }

    public static int findVertex(int[] weight, boolean[] visited) {
        int v = weight.length;
        int minVertex =-1;
        for(int i =0;i<v;i++){
            if(!visited[i] && (minVertex==-1 || weight[i]< weight[minVertex] )){
                minVertex = i;

            }
        }
//        System.out.print(minVertex + " ");

        return minVertex;
    }
}
