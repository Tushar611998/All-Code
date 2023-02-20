package LeetCode.LinkedList;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode t= head.next;
        while(t!=null){
            temp.next = t.next;
            t.next = head;
            head = t;
            t = temp.next;
        }
        return head;

    }

    public static void main(String[] args) {
        ListNode n = new ListNode(1);
        ListNode ll = n;
        for(int i=2;i<7;i++){
            ListNode temp = new ListNode(i);
            ll.next = temp;
            ll=ll.next;
        }
        ListNode ans =reverseList(n);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
