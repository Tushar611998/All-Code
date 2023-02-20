import java.util.Scanner;

public class stack {
//    public class Stack {

        Node<Integer> front;
        Node<Integer> top;
        int size;


        //Define the data members


        public stack() {
            this.front=null;
            size =0;
            //Implement the Constructor
        }



        /*----------------- Public Functions of Stack -----------------*/


        public int getSize() {
            return size;
            //Implement the getSize() function
        }

        public boolean isEmpty() {
            return size==0;
            //Implement the isEmpty() function
        }

        public void push(int element) {
            Node<Integer> node = new Node<>(element);
            if(size==0){
                front = node;
                size++;
            }else {
                size++;
                node.next = front;
                front = node;
            }

            //Implement the push(element) function
        }

        public int pop() {
            if(size==0){
                return -1;
            }
            while(size<=1){
                if(top==null){
                    top = front;
                }
                Node<Integer> n = front;
                front = front.next;
                top = n;
                size--;
            }
            int temp =front.data;
            size--;
            front = front.next;
            while(top!=null){
                if(front==null){
                    front = top;
                }
                Node<Integer> n1 = front;
                top = top.next;
                front = n1;
                size++;
            }
            return temp;
            //Implement the pop() function
        }

        public int top() {
            if(size==0){
                return -1;
            }
            return front.data;
            //Implement the top() function
        }
    }
    class Node<T> {
        T data;
        Node<T> head;
        Node<T> next;

        public Node(T data) {
            this.head = null;
            this.data = data;
            this.next = null;
        }

    }


