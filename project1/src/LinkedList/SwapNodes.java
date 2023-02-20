package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;

public class SwapNodes {
    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        if(head== null){
            return head;
        }

        Node<Integer> temp = head;
        Node<Integer> p1= null;
        Node<Integer> p2= null;
        Node<Integer> c1= null;
        Node<Integer> c2= null;
        Node<Integer> p3= null;
        int count =1;
        if(i==0 || j ==0){
            if(i==0){
                i = j;
            }
            while(count != i && temp!=null){
                count = count +1;
                temp = temp.next;
            }
            c1 = head;
            p2 = temp;
            c2 = temp.next;
            p3 = c1.next;

            p2.next = c1;
            head = c2;
            c1.next = c2.next;
            c2.next = p3;
            return head;
        }
        else {

            while (count != i && temp != null) {
                count = count + 1;
                temp = temp.next;
            }
            if (i - j == 1 || j - i == 1) {
                p1 = temp;
                p2 = temp.next;
                c1 = p2.next;
                p3 = c1.next;

                p1.next = c1;
                c1.next = p2;
                p2.next = p3;
                return head;
            }
            p1 = temp;
            c1 = temp.next;
            count = 1;
            temp = head;
            while (count != j && temp != null) {
                count = count + 1;
                temp = temp.next;
            }

            p2 = temp;
            c2 = temp.next;
            p3 = c1.next;

            p1.next = c2;
            p2.next = c1;
            c1.next = c2.next;
            c2.next = p3;


            return head;
        }


        //Your code goes here
    }

    public static void main(String[] args) {
        Node head = takingInput();
        head = swapNodes(head,0,4);
        print(head);
    }
}
