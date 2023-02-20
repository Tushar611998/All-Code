package LeetCode.LinkedList;

import java.util.Scanner;

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        int length=0;
        while(temp2!=null){
            length++;
            temp2=temp2.next;
        }
        temp2=head;
        ListNode n = new ListNode(0);
        int count =0;
        while(count!=length){
            ListNode n1 = new ListNode(temp2.val);
            n1.next=n;
            n = n1;
            count++;
            temp2=temp2.next;
        }
        count=0;
        while(count!=length/2){
            if(temp1.val!=n.val){
                return false;
            }
            count++;
            temp1=temp1.next;
            n=n.next;
        }
        return true;

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

        boolean ans = isPalindrome(head);
//        while(ans!=null){
//            System.out.print(ans.val+" ");
//            ans=ans.next;
//        }
        System.out.println(ans);
    }
}
