package LinkedList;

import static LinkedList.LinkedListUsed.print;
import static LinkedList.LinkedListUsed.takingInput;

public class SkipMDeleteN_ByCreatingNewNode {
    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {

        if(head== null || N ==0){
            return head;
        }

        Node<Integer> temp = head;
        Node<Integer> t1 = new Node<Integer>(0);
        Node<Integer> dummy = t1;
        int c1 =1;
        int c2 =1;



        while(temp !=null ){

            while(c1 <=M && temp !=null){
                c1 = c1 +1;
                if(temp.data.equals(0)){
                    temp = temp.next;
                }
                else{
                    t1.next = temp;
                    t1 = temp;
                    temp = temp.next;
                }
            }

            while(c2<=N && temp !=null){
                c2 = c2 +1;

                temp = temp.next;
            }
            c1 = 1;
            c2 = 1;


        }
        t1.next = null;

        return dummy.next;
        //Your code goes here
    }

    public static void main(String[] args) {
        Node<Integer> head = takingInput();
        head = skipMdeleteN(head,2,3);
        print(head);
    }
}
