package DSA_Test2;
import java.util.LinkedList;
import java.util.Scanner;

public class DeleteAlternateNumbeFromLinkedList {
    public static void deleteAlternateNodes(Node<Integer> head) {
//        LinkedList<Integer> l = new LinkedList<>();
        if (head == null) {
            return;
        }
        Node<Integer> temp = head;
        while(temp.next!=null && temp.next.next!=null){
            temp.next = temp.next.next;
            temp = temp.next;
        }
        temp.next = null;

    }

    public static  Node<Integer> takingInput(){
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        Node<Integer> head = new Node<>(element);
        Node<Integer> temp = head;

        while(true) {
            element = sc.nextInt();
            if (element != -1) {
                head.next = new Node<Integer>(element);
                head = head.next;
            } else {
                head.next = null;
                break;
            }
        }

        return temp;
    }

    public static void main(String[] args) {
//        LinkedList<Integer> l = new LinkedList<>();
        Node<Integer > head = takingInput();
        Node<Integer > temp = head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
        deleteAlternateNodes(head);
        Node<Integer> temp2 = head;
        while(temp2!=null){
            System.out.print(temp2.data+ " ");
            temp2 = temp2.next;
        }
    }
}
class Node<T>{
    T data;
    Node<T> next;

    public Node(T element){
        this.data = element;
        next = null;
    }

}
