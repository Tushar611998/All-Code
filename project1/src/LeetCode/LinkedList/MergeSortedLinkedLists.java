package LeetCode.LinkedList;

public class MergeSortedLinkedLists {
    public static node mergeTwoLists(node list1,node list2) {

        node head = null;
        node tail = null;
        node temp1 = head;
//        node temp2 = tail;
        if(list1.data <= list2.data){
            head = tail = list1;
            list1 =list1.next;
        }else{
            head = tail =list2;
            list2 =list2.next;
        }

        while(list1 !=null && list2 !=null){
            if(list1.data <=list2.data){
                tail.next = list1;
                tail = list1;
                list1= list1.next;
            }else {
                tail.next = list2;
                tail = list2;
                list2= list2.next;
            }
        }
        if(list1 ==null){
            tail.next = list2;
        }else {
            tail.next = list1;
        }
        return head;


    }

    public static void main(String[] args) {
        node h1 = new node(5);
//        h1.next = new node(2);
//        h1.next.next = new node(4);
        node h2 = new node(1);
        h2.next = new node(2);
        h2.next.next = new node(4);
        node ans = mergeTwoLists(h1,h2);
        while(ans!=null){
            System.out.println(ans.data);
            ans = ans.next;
        }
    }
}
