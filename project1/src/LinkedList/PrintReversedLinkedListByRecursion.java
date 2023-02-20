package LinkedList;

import static LinkedList.LinkedListUsed.takingInput;

public class PrintReversedLinkedListByRecursion {
    public static void printReverse(Node<Integer> root,Node<Integer> temp) {
//        if(root ==null){
//            return;
//        }
//        else if(root.next==null){
//            return;
//        }
//        else {

//        int count =0;
//        Node<Integer> temp = root;
////        Node<Integer> tail = null;
            if (temp.next== null) {
                System.out.print(temp.data + " ");


            }
            if(temp.next != null) {

                printReverse(root, temp.next);
//            printReverse(root,root.next);
                if (temp.next != null) {
                    System.out.print(temp.data + " ");

                    return;

                }
            }


//        }


//        while(temp !=null){
//            System.out.print(temp.data +" ");
//        }
//        System.out.println();




        //Your code goes here
    }

    public static void main(String[] args) {
        Node<Integer> node = takingInput();
        printReverse(node,node);
    }
}
