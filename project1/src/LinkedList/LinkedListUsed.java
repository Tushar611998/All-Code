package LinkedList;

import java.util.Scanner;

public class LinkedListUsed {
    public static Node<Integer> delete(Node<Integer> head, int pos){
        int count = 0;
//        if(head.next ==null){
//            count = count+1;          // it throws null pointer exception because we point at null
//        }
//        else{
            Node <Integer> temp = head;
            while(temp != null){
                temp = temp.next;
                count = count +1;
            }
//        }
        int length = count;
        count =0;
        if(pos ==0 && length >0){       //length >0 to avoid null pointer exception
            head = head.next;
        }
        else{
            temp = head;
            while(count <pos-1 && temp.next != null){
                temp = temp.next;
                count = count +1;
            }
            if(pos<=length-1 && temp.next !=null){
                temp.next = temp.next.next;
            }
        }
        return head;
    }
    public static Node<Integer> insert(Node<Integer> head,int data,int pos){
        int count =0;
        Node <Integer> newNode = new Node<>(data);
        if(pos==0){
            newNode.next = head;
            head = newNode;
            return head;
        }
        else {
            Node<Integer> temp = head;
            while(count < pos-1){
                temp = temp.next;
                count = count+1;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }

    public static Node <Integer> takingInput() {
        Scanner sc = new Scanner(System.in);

        Node<Integer> head = null;
        Node<Integer> tail = null;


        int data = sc.nextInt();

        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;

                tail = newNode;
            } else {
                Node<Integer> temp = head;
                while (temp.next != null) {
                    temp =temp.next;
                }
                temp.next = newNode;
                tail = temp.next;

            }
            data = sc.nextInt();

        }
        return head;
    }
    public  static void print(Node <Integer> head){

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {
//        Node<Integer> node1 = new Node<>(10);
//        Node<Integer> node2 = new Node<>(20);
//        Node<Integer> node3 = new Node<>(30);
//
//        node1.next = node2;
//        node2.next = node3;
//
//        System.out.print(node1.data + " ");
//        System.out.print(node1.next+ " ");
//        System.out.print(node2);
//        System.out.println();

//        Node <Integer> head = node1;
//        while(head != null){
//            System.out.print(head.data + " ");
//            head = head.next;
//        }

//        print(node1);
//        print(node2);
//        print(node3);

        Node <Integer> newNode = takingInput();
        print(newNode);
//        Node <Integer> newNOde1 = insert(newNode,80,0);
//        print(newNOde1);
        Node <Integer> newNOde2 = delete(newNode,0);
        print(newNOde2);

    }
}
