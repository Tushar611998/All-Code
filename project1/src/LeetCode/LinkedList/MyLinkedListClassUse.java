package LeetCode.LinkedList;

public class MyLinkedListClassUse {
    public static void main(String[] args) {
        MyLinkedListClass ll = new MyLinkedListClass();
        ll.addAtHead(7);
        ll.addAtHead(2);
        ll.addAtHead(1);
        ll.addAtIndex(3,0);
        ll.deleteAtIndex(2);
        ll.addAtHead(6);
        ll.addAtTail(4);
//        ll.addAtIndex(1,2);
        System.out.print(ll.get(4)+" ");
//        ll.deleteAtIndex(1);
//        ll.addAtIndex(4,5);
//        System.out.print(ll.get(1)+" ");
//        System.out.print(ll.get(2)+" ");
//        System.out.print(ll.get(3)+" ");
//        System.out.print(ll.get(4)+" ");
    }
}
