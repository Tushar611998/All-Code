package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;

public class ReverseLinkedLIstRecursively_ON {
    public static Node<Integer> reverseLL2(Node<Integer> head){

        if (head==null || head.next == null){
            return head;
        }

        Node<Integer> finalTail = head.next;
        Node<Integer> smallans = reverseLL2(head.next);
        finalTail.next = head;
        head.next = null;

        return smallans;

    }

    public static void main(String[] args) {
        Node<Integer> head = takingInput();
        Node<Integer> ans = reverseLL2(head);
        print(ans);

    }

}
