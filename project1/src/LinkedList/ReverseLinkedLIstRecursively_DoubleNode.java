package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;

public class ReverseLinkedLIstRecursively_DoubleNode {
    public static DoubleNode reverseLL(Node<Integer> head){

        if (head==null || head.next == null){
            DoubleNode ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }

        DoubleNode smallans = reverseLL(head.next);

        smallans.tail.next = head;
        smallans.tail= head;
        smallans.tail.next= null;
        DoubleNode newNode = new DoubleNode();
        newNode.head = smallans.head;
        newNode.tail = smallans.tail;

        return newNode;

    }

    public static void main(String[] args) {
        Node<Integer> head = takingInput();
        DoubleNode ans = reverseLL(head);
        print(ans.head);

    }
}
class DoubleNode{
    Node<Integer> head;
    Node<Integer> tail;
}
