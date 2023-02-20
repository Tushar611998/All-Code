package Graphs_1;

import java.util.Scanner;

import static Graphs_1.Prims_Algorithm_MST.findVertex;

public class Dijkshtra_Algorithm_MST {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();

        int arr[][] = new int[V][V];
        for (int i = 0; i < E; i++) {
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            int weight = s.nextInt();

            arr[v1][v2] = weight;
            arr[v2][v1] = weight;

        }

        dijkstra(arr);

        /* Write Your Code Here
         * Complete the Rest of the Program
         * You have to take input and print the output yourself
         */

    }

    private static void dijkstra(int[][] arr) {
        int v = arr.length;
        boolean visited[] = new boolean[v];
        int distance[] = new int[v];
        distance[0] = 0;
        for (int i = 1; i < v; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < v-1; i++) {
            // pick min vertex with min weight
            int minVertex = findVertex(distance, visited);
            visited[minVertex] = true;
            for (int j = 0; j < v; j++) {
                if (arr[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE) {
                    int newDist = distance[minVertex] + arr[minVertex][j];
                    if (distance[j] > newDist) {
                        distance[j] = newDist;
                    }
                }
            }

        }
        for(int i =0;i<v;i++){
            System.out.println(i + " " + distance[i]);
        }

    }
}
