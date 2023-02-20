package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;

public class DeleteNoderecursively {
    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
        if(head ==null){
            return head;
        }

        if(pos ==0){
            return head.next;
        }


        head.next =  deleteNodeRec(head.next, pos-1);
        return head;
        //Your code goes here
    }
    public static void main(String[] args) {
        Node <Integer> node = takingInput();
        Node<Integer> ans = deleteNodeRec(node,3);
        print(ans);
    }

}
