package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;

public class ReverseLinkedLIstRecursively_ON2 {
    public static Node<Integer> reverse(Node<Integer> head){

        if(head==null || head.next==null){
            return head;
        }


        Node<Integer> smallans = reverse(head.next);
        Node <Integer> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return smallans;
    }

    public static void main(String[] args) {
        Node<Integer> node = takingInput();
        Node<Integer> ans = reverse(node);
        print(ans);
    }
}
