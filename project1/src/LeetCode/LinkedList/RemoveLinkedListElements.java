package LeetCode.LinkedList;

import java.util.Scanner;

public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head= head.next;
        }
        ListNode temp =head;
        ListNode pre = null;

        while(temp!=null){
            if(temp.val==val && pre==null){
                head= head.next;
                temp=head;
            }else if(temp.val==val && temp.next==null){
                pre.next=null;
                temp=null;
            }else if(temp.val==val){
                pre.next=temp.next;
                temp = temp.next;
            }
            else if(temp!=null){
                pre = temp;
                temp=temp.next;
            }
        }
        return head;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h =sc.nextInt();
        ListNode head = new ListNode(h);
        ListNode temp = head;

            while (true) {
                int n = sc.nextInt();
                if(n==-1){
                    break;
                }
                ListNode n1 = new ListNode(n);
                temp.next = n1;
                temp = temp.next;
            }

        ListNode ans = removeElements(head,2);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
