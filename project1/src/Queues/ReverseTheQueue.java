package Queues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseTheQueue {

    public static void reverseQueue(Queue<Integer> input) {


        Stack s = new Stack();
        int size = input.size();

        for(int i =0;i< size;i++){

            int temp = input.peek();
            input.poll();
            s.push(temp);
        }
        for(int i = 0;i<size;i++){
            int temp = (int) s.peek();
            s.pop();
            input.add(temp);

        }

    }

    public static void main(String[] args) {
        Queue <Integer> Q = new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        reverseQueue(Q);
        int temp = Q.size();
        for(int i = 0;i<temp;i++){
            System.out.print(Q.poll()+ " ");
        }
    }
}
