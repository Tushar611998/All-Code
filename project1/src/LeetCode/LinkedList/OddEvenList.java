package LeetCode.LinkedList;

import java.util.Scanner;

public class OddEvenList {
    public static ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        ListNode tail = null;
        ListNode pre = null;
        int length=0;
        while(temp!=null){
            length++;
            tail=temp;
            temp=temp.next;
        }
        temp = head;
        int count=1;
        while(temp!=null && count<=length){
            if(count%2==0){
                pre.next = temp.next;
                tail.next=temp;
                tail= tail.next;
                tail.next=null;
                temp=pre.next;
                count++;
            }
            else if(temp!=null){
                count++;
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

        ListNode ans = oddEvenList(head);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
