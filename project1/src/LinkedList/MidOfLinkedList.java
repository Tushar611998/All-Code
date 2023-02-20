package LinkedList;

import static LinkedList.LinkedListUsed.takingInput;

public class MidOfLinkedList {
    public static Node<Integer> midPoint(Node<Integer> head) {

        Node<Integer> slow = head;
        Node<Integer> fast = head;
        if(head==null || head.next ==null){
            return slow;
        }

        while(fast.next != null){

            if(fast.next!=null){

                if(fast.next.next==null){
                    return slow;
                }
                else {
                    slow = slow.next;
                    fast = fast.next.next;
                }
            }
        }
        return slow;

        //Your code goes here
    }

    public static void main(String[] args) {
        Node <Integer> node = takingInput();
        Node <Integer> ans = midPoint(node);
        System.out.println(ans.data);

    }

}
