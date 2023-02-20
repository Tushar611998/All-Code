package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;

public class FindNodeInLinkedList {

    public static int findNode(Node<Integer> head, int n) {

        int count = 0;
        Node <Integer> temp = head;
        if(n !=0){
            while(temp.next !=null){
                temp = temp.next;
                count = count+1;
                if(temp.data ==n ){
                    return count;
                }
            }
        }else{
            return -1;
        }
        return -1;
        // Write your code here.
    }

    public static void main(String[] args) {
        Node<Integer> node = takingInput();
        int newNOde = findNode(node,3);
        System.out.println(newNOde);

    }
}
