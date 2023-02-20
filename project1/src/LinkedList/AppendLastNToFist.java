package LinkedList;

public class AppendLastNToFist {
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {


        int count = 0;
        Node<Integer> temp = head;

        while(temp !=null && head !=null){
            temp = temp.next;
            count = count +1;
        }

        int length = count;
        count =0;

        Node<Integer> tail = null;
        Node<Integer> temp2 = head;
        temp = head;

        if(n !=0 && head !=null){
            while(temp.next != null){
                temp =temp.next;
                count = count+1;
                if((length - count)==n+1){
                    tail = temp;
                }
                else if((length - count)==n){
                    head = temp;
                }
            }
            temp.next = temp2;
            tail.next = null;
        }
        else{
            return head;
        }
        return head;
        //Your code goes here
    }

}
