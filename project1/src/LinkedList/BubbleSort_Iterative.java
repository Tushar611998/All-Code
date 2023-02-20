package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;

public class BubbleSort_Iterative {
    public static Node<Integer> bubbleSort(Node<Integer> head) {

        if(head== null){
            return head;
        }
        Node<Integer> temp = head;
        Node<Integer> p1 = head;
        Node<Integer> c1 = head.next;
        int count = 0;
        Node<Integer> newHead = head;
        while(temp != null){
            count = count +1;
            temp = temp.next;
        }
        int length = count;
        int i = 0;
        while(i<=length) {
            temp = newHead;
            p1 = newHead;
            c1 = newHead.next;
            count = 0;
            if (c1!=null && c1.data <p1.data) {

                newHead = swap(head, count);
                head = newHead;
                temp = head;
                p1 = c1.next;
                c1 = p1.next;

            }
            else if(p1!=null && c1!= null) {
                p1 = p1.next;
                c1=c1.next;

            }
            count =1;
            temp = p1;


            while (p1 != null && c1 !=null) {
                if (p1 != null  && c1.data < p1.data) {
                    newHead = swap(head, count);
                    p1 = c1.next;
                    c1= p1.next;
                }else {
                    p1 = p1.next;
                    c1= c1.next;
                    temp =p1 ;
                }
                count = count + 1;
                temp =p1 ;

            }
            i++;
        }


        return newHead;
        //Your code goes here
    }

    public static Node<Integer> swap(Node<Integer> head,int i) {
        Node<Integer> temp = head;
        Node<Integer> c1 = null;
        Node<Integer> c2 = null;
        Node<Integer> p1 = null;
        Node<Integer> p2 = null;
        Node<Integer> p3 = null;
        int count =1;

        if(i==0){
            c1 = head;
            c2 = head.next;
            p3 = c2.next;

            head = c2;
            c2.next = c1;
            c1.next = p3;
            return c2;
        }

        while(count != i && temp!=null ){
            count = count +1;
            temp = temp.next;
        }
        p1 = temp;
        p2 = temp.next;
        c1 = p2.next;
        p3 = c1.next;



        p1.next = c1;
        c1.next = p2;
        p2.next = p3;


        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takingInput();
        head = bubbleSort(head);
        print(head);
    }

}
