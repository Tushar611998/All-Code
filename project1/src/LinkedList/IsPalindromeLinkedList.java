package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;

public class IsPalindromeLinkedList {
    public static void isPalindrome(Node<Integer> head) {
//        if(head==null){
//            return true;
//        }
//        if(head.next==null){
//            return true;
//        }

        int i = 0;
        Node<Integer> h1 = head;
        Node<Integer>h2 = null;
        Node<Integer> t1 = null;
        Node<Integer> t2 = null;
        while(h1.next !=null){
            i = i+1;
            h1 = h1.next;
        }
        t2 = h1;
        int length = i+1;
        i=0;
        h1 = head;
        if(length%2 == 0){
            while(i<length/2-1){
                i = i+1;
                h1 = h1.next;
            }
            t1 = h1;
            h2 = h1.next;

        }
        else{
            Node<Integer> temp2 = h1;
            while(i<length/2-1){
                i = i+1;
                temp2 = temp2.next;
            }
            t1 = temp2;
            print(h1);
            h2 = temp2.next.next;

        }
        i = 1;
        int count =0;
        if(h2.next!=null) {
            Node<Integer> temp = h2;
            while((length/2)-i>=0){
                while(count<=(length/2)-i-1){
                    count = count +1;
                    temp = temp.next;
                }
                t2.next = temp;

                t2 = t2.next;
                h2 = h2.next;
                i++;
            }

            t2.next = null;
        }

        print(h2);



        //Your code goes here
    }

    public static void main(String[] args) {
        Node <Integer> node = takingInput();
//        isPalindrome(node);
        Node<Integer> curr = node;
        Node<Integer> prv = null;
        Node<Integer> fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prv;
            prv = curr;
            curr = fwd;

        }
        print(prv);
    }
}
