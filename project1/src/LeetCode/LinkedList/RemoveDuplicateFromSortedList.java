package LeetCode.LinkedList;

import java.util.Scanner;

public class RemoveDuplicateFromSortedList {
    public static node deleteDuplicates(node head) {
        node head1 = null; node tail = null;

        head1 = tail = head;
        node temp =head.next;
        node prev = null;
        while(temp!=null){
            if(tail.data == temp.data ){
                prev =temp;
                temp =temp.next;
            }else{
                tail.next =temp;
                tail = temp;
                prev = temp;
                temp = temp.next;
            }
        }
        if(prev.data == tail.data){
            tail.next=null;
        }
        return head1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node head = new node(sc.nextInt());
        node tail = head;
        while(true){
            int a = sc.nextInt();
            if(a==-1){
                break;
            }
            node b = new node(a);
            tail.next = b;
            tail=b;
        }
        node ans = deleteDuplicates(head);
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
