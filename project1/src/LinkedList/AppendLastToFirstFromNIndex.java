package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;

public class AppendLastToFirstFromNIndex {

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {

        int count =0;
        Node<Integer> tail = null;
        Node<Integer> temp2 = head;
        Node<Integer> temp = head;
        while(temp.next !=null){
            temp = temp.next;
            count = count +1;
            if(count==n-1){
                tail = temp;
            }
            else if(count ==n){
                head = temp;
            }
        }
        temp.next = temp2;
        tail.next = null;
        // tail = temp;
        // tail.next = head;
        // temp = head;

        // while(temp.next !=null){
        //    temp = temp.next;
        //     count = count +1;
        //     if(count==n){
        //         head = temp;
        //         return head;
        //     }

        return head;



        //Your code goes here
    }

    public static void main(String[] args)
    {
        Node<Integer> input = takingInput();
        Node<Integer> newNode = appendLastNToFirst(input,4);
        print(newNode);
    }

}
