package DSA_Test2;
import java.util.Stack;
import static DSA_Test2.DeleteAlternateNumbeFromLinkedList.takingInput;

public class NextNumber {

    public static Node<Integer> nextLargestNumber(Node<Integer> head){
        Node<Integer> h = reverse(head);
        Node<Integer> temp = h;
        Node<Integer> prev = null;
        int carry =1,num;

        while(temp!=null){
            num = ((temp.data)+carry)%10;
            carry = ((temp.data)+carry)/10;
            temp.data = num;
            prev = temp;
            temp = temp.next;
        }
        if(carry==1){
            Node<Integer> newNode = new Node<>(carry);
            prev.next = newNode;
        }
        return reverse(h);
    }
    public static Node<Integer> reverse(Node<Integer> head){
        Node<Integer> curr =head;
        Node<Integer> prev =null;
        Node<Integer> fwd =null;

        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node<Integer> head = takingInput();
        head = nextLargestNumber(head);
        Node<Integer> temp2 = head;
        while(temp2!=null){
            System.out.print(temp2.data+ " ");
            temp2 = temp2.next;
        }
    }

}

