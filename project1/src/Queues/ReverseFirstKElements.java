package Queues;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class ReverseFirstKElements {

    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {


        Stack s = new Stack();
        int size = input.size();

        for(int i =0;i< k;i++){

            int temp = input.peek();
            input.poll();
            s.push(temp);
        }
        for(int i = 0;i<k;i++){
            int temp = (int) s.peek();
            s.pop();
            input.add(temp);

        }
        for(int i =0;i<size-k;i++){
            int temp = input.peek();
            input.poll();
            input.add(temp);
        }
        return input;

    }

    public static void main(String[] args) {
        Queue <Integer> Q = new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        Queue <Integer> s = reverseKElements(Q,3);
        int temp = Q.size();
        for(int i = 0;i<temp;i++){
            System.out.print(Q.poll()+ " ");
        }
    }
}
