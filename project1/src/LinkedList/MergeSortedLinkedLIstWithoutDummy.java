package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;

public class MergeSortedLinkedLIstWithoutDummy {
    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> t1 = head1;
        Node<Integer> t2 = head2;
        Node<Integer> tail3 = null;
        Node<Integer> head3 = null;

        if(t1.data<=t2.data){
            head3 = t1;
            tail3 = t1;
            t1 = t1.next;
        }
        else{
            head3 = t2;
            tail3 = t2;
            t2 = t2.next;
        }
        while(t1!=null && t2 !=null){

            if(t1.data<=t2.data){
                tail3.next = t1;
                tail3 = t1;
                t1=t1.next;
            }
            else{
                tail3.next = t2;
                tail3 = t2;
                t2 = t2.next;
            }
        }
        if(t1==null){
            tail3.next =t2;
        }
        else{
            tail3.next = t1;
        }
        return head3;
    }

        public static void main(String[] args) {
        Node<Integer> node1 = takingInput();
        Node<Integer> node2 = takingInput();
        Node<Integer> ans = mergeTwoSortedLinkedLists(node1,node2);
        print(ans);
    }
}
