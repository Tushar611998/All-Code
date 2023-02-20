package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;

public class InsertNodeRecursively {
    public static Node<Integer> insert(Node<Integer> head,int pos,int element){
        if(pos ==0){
            Node <Integer> newNode = new Node<>(element);
            newNode.next =head;
            return newNode;
        }

        if(head== null){
            return head;
        }

        head.next = insert(head.next,pos-1,element);
        return head;

    }

    public static void main(String[] args) {
        Node <Integer> node = takingInput();
        Node<Integer> ans = insert(node,3,10);
        print(ans);
    }
}
