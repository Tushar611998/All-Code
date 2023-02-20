package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;
import static LinkedList.MergeSortedLinkedLIstWithoutDummy.mergeTwoSortedLinkedLists;

public class MergeSortLinkedList {
    public static Node<Integer> mergeSort(Node<Integer> head) {

        Node<Integer> temp = head;

        if(temp.next==null){
            return head;
        }
        int count =0;
        while(temp!=null){
            count = count+1;
            temp = temp.next;
        }
        int mid = count/2;
        count =0;
        temp = head;
        Node<Integer> tail =null;
        Node<Integer> tail2 =null;
        Node<Integer> head2 =null;
        while(count <= mid-2){
            count = count+1;
            temp = temp.next;
        }
        tail = temp;
        head2 = tail.next;
        tail.next = null;
        print(head);
        print(head2);

        Node <Integer> smallans1 = mergeSort(head);
        Node <Integer> smallans2 = mergeSort(head2);

        Node<Integer> finalhead = mergeTwoSortedLinkedLists(smallans1,smallans2);
        print(finalhead);
       return finalhead;

    }

    public static void main(String[] args) {
        Node<Integer> node = takingInput();
        Node<Integer> ans = mergeSort(node);
        print(ans);


    }
}
