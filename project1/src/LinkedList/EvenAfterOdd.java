package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;

public class EvenAfterOdd {
    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        if(head==null){
            return head;
        }
        Node<Integer> temp = head;
        Node<Integer> t1 = new Node<Integer>(0) ;
        Node<Integer> t2 = new Node<Integer>(0);
        Node<Integer> h1 = t1;
        Node<Integer> h2 = t2;

        while(temp != null){
            if(temp.data%2!=0){
                t1.next = temp;
                t1 = temp;

            }
            else{
                t2.next = temp;
                t2 = temp;

            }
            temp = temp.next;
        }
        t2.next = null;
        t1.next = h2.next;

        return h1.next;

        //Your code goes here
    }

    public static void main(String[] args) {
        Node<Integer> head = takingInput();
        head = evenAfterOdd(head);
        print(head);
    }
}
