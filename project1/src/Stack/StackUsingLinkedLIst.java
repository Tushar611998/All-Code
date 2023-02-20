package Stack;

public class StackUsingLinkedLIst <T>{
    private Node<T> head;
    private int size;

    public <T> StackUsingLinkedLIst(){
        head = null;
        size =0;
    }

    public int size(){
        return  size;
    }

    public T top() throws StackIsEmptyException {
        if(size==0){
            StackIsEmptyException S = new StackIsEmptyException();
            throw S;
        }
        return  head.data;
    }

    public boolean isEmpty(){
        return size==0;
    }
    public void push(T element){
        Node<T> node = new Node<>(element);
        node.next = head;
        head = node;
    }

    public T pop(){
        T temp = head.data;
        head = head.next;
        return  temp;
    }
}





class Node <T>{

     T data;
     Node<T> next;

    public Node(T data){
        this.data = data;
        next = null;
    }

}


