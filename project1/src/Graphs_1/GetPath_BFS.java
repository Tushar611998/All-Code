package Graphs_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GetPath_BFS {
    public static void main(String[] args)  throws NumberFormatException, IOException {

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int arr[][] =new int [v][v];
        for(int i =0;i<e;i++){
            int sv = sc.nextInt();
            int ev = sc.nextInt();

            arr[sv][ev] = 1;
            arr[ev][sv] =1;

        }
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        boolean b []= new boolean [arr.length];
        ArrayList<Integer> p =  getPathBFS(arr,v1,v2,b);
        if(p!=null){
            for(int i=0;i<p.size();i++){
                System.out.print(p.get(i) + " ");
            }

        }


        /* Write Your Code Here
         * Complete the Rest of the Program
         * You have to take input and print the output yourself
         */
    }

    public static ArrayList<Integer> getPathBFS(int arr[][],int s, int e,boolean visited[]){
        if(s==e){
            ArrayList<Integer> ans1 = new ArrayList<>();
            ans1.add(e);
            return ans1;
        }
        Queue<Integer> ans = new Queue();
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr1 = new ArrayList<>();

        ans.enqueue(s);
        // map.put(s);
        visited[s] =  true;
        while(!ans.isEmpty()){
            int a = ans.dequeue();
            for(int i=0;i<arr.length;i++) {
                if (arr[a][i] == 1 && !visited[i]) {

                    map.put(i, a);
                    ans.enqueue(i);
                    visited[i] = true;

                    if (i == e) {
                        arr1.add(i);
                        while(!arr1.contains(s) && map.containsKey(i)) {
                            int h = map.get(i);
                            arr1.add(h);
                            i = h;

                        }
                        return arr1;
                    }


                }
            }

        }
        return null;
    }
}

