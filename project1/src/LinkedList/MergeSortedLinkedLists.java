package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;

public class MergeSortedLinkedLists {
    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {

        Node<Integer> t1 = head1;
        Node<Integer> t2 =head2;

        Node<Integer> dummy =new Node<>(0);
        Node<Integer> h3 =dummy;
        Node<Integer> tail = dummy;

        while(true) {

            if (t1 == null) {
                tail.next = t2;
                break;
            } else if (t2 == null) {
                tail.next = t1;
                break;
            }


            if (t1.data <= t2.data) {
                tail.next = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                t2 = t2.next;
            }
            tail= tail.next;
        }

        return h3.next;
        //Your code goes here
    }

    public static void main(String[] args) {
        Node<Integer> node1 = takingInput();
        Node<Integer> node2 = takingInput();
        Node<Integer> ans = mergeTwoSortedLinkedLists(node1,node2);
        print(ans);
    }
}
