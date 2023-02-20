package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;

public class KReverse {
    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        if(head==null || k<=1){
//            Node<Integer> newNode = new Node<>(0);
            return head;
        }
        if(head.next== null){
            return head;
        }

        Node<Integer> h1 = head;
        Node<Integer> t1 = head;
        Node<Integer> t2 = null;
        int count = 1;

        while(count!=k && h1!=null){
            count = count +1;
            t1 = h1.next;
            h1= h1.next;
        }
        if(h1==null){
            t2 = null;
            DoubleNode newNode = Reverse(head);
            return newNode.head;
        }
        else{
            t2 = h1.next;
            t1.next = null;
            h1 = head;

        }
        Node<Integer> smallans = kReverse(t2,k);
        DoubleNode newNode = Reverse(h1);
        newNode.tail.next = smallans;
        return newNode.head;



        //Your code goes here
    }
    public static DoubleNode Reverse(Node<Integer> head) {

        Node<Integer> curr = head;
        Node<Integer> prev =  null;
        Node<Integer> fwd =  null;
        Node<Integer> tail =  head;

        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;

        }

        DoubleNode ans = new DoubleNode();
        ans.head = prev;
        ans.tail = tail;
        return ans;
    }

    public static void main(String[] args) {
        Node <Integer> head = takingInput();
        head = kReverse(head,6);
        print(head);
    }
}
