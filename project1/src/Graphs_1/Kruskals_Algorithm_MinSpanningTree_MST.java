package Graphs_1;

import java.util.Scanner;
import java.util.Arrays;

public class Kruskals_Algorithm_MinSpanningTree_MST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        Edges input[] = new Edges[E];
        for(int i =0;i<E;i++){
//            Edges curr = input[i];
            input[i] = new Edges();
            input[i].source = sc.nextInt();
            input[i].dest = sc.nextInt();
            input[i].weight = sc.nextInt();
        }
        kruskals (input,V);


    }

    public static void kruskals(Edges input[],int n){
        Arrays.sort(input);

        Edges output[] = new Edges[n-1];
        int parent[] = new int[n];
        for(int i =0;i<n;i++){
            parent[i] =i;
        }
        int count =0;
        int i =0;
        while(count!=n-1){
            Edges curr = input[i];
            int sourceParent = findParent(curr.source,parent);
            int destParent = findParent(curr.dest,parent);
            if(sourceParent!=destParent){
                output[count] = curr;
                count++;
                parent[sourceParent] = destParent;
            }
            i++;
        }
        for(int j =0;j<n-1;j++){
            if(output[j].source <output[j].dest){
                System.out.print(output[j].source + " " + output[j].dest + " " + output[j].weight);
            }else{
                System.out.print(output[j].dest + " " + output[j].source + " " + output[j].weight);
            }
            System.out.println();
        }
    }
    public static int findParent(int v,int []parent){
        if(parent[v] ==v){
            return v;
        }
        return findParent(parent[v],parent);
    }
}
class Edges implements Comparable<Edges> {
    int source;
    int dest;
    int weight;

    @Override
    public int compareTo(Edges o) {
        return this.weight - o.weight;
    }

}
