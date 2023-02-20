package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;

public class RemoveDuplicates {
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        if(head == null){
            return head;
        }

        Node<Integer> currentNode = head;
        Node<Integer> tail = null;
        Node<Integer> nextNode = head.next;

        while(nextNode.next !=null ){
            while(nextNode.data == currentNode.data && nextNode.next !=null){
                currentNode.next = nextNode.next;
                nextNode = currentNode.next;

            }
            tail = currentNode;
            currentNode = currentNode.next;

        }
        if(currentNode.data ==tail.data){
            tail.next = null;
            currentNode = tail.next;
        }
        return head;


        //Your code goes here
    }

    public static void main(String[] args) {
        Node<Integer> node = takingInput();
        Node<Integer> newNode =removeDuplicates(node);
        print(newNode);
    }
}
