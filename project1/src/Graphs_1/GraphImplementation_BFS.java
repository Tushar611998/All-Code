package Graphs_1;
//import java.util.Queue;
import java.io.IOException;
import java.util.Scanner;

public class GraphImplementation_BFS {
    public static void main(String[] args) throws NumberFormatException, IOException {

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int arr[][] = new int[v][v];
        for(int i =0;i<e;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr[start][end] = 1;
            arr[end][start] = 1;
        }
        printBFS(arr);

        /* Write Your Code Here
         * Complete the Rest of the Program
         * You have to take input and print the output yourself
         */
    }
    public static void printBFS(int arr[][]){
        boolean[] ans = new boolean[arr.length];
        for(int i =0;i<arr.length;i++){
            if(!ans[i]){
                printBFSHelper(arr,i,ans);
            }
        }
    }
    public static void printBFSHelper(int arr[][],int start,boolean ans[]){
        Queue<Integer> q = new Queue<Integer>();
        q.enqueue(start);
        ans[start] = true;
        while(!q.isEmpty()){
            int d = q.dequeue();
            System.out.println(d);
            for(int i =0;i<arr.length;i++){
                if(arr[start][i] ==1 && !ans[i]){
                    q.enqueue(i);
                    ans[i] =true;
                }
            }
        }

    }
}
class Queue<T>{
    node<T> front;
    node<T> rear;
    int size;

    public Queue(){
        this.front = null;
        this.rear = null;
        size = 0;
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void enqueue(T data){

        node <T> a = new node<>(data);
        if(size==0){
            front =  a;
            rear =  a;
        }
        size++;
        rear.next = a;
        rear = a;
    }
    public T dequeue(){
        size--;
        T temp = front.data;
        front = front.next;
        return temp;
    }

}
class node<T>{
    T data;
    node<T> next;
    public node(T data){
        this.data = data;
        this.next = null;
    }
}
