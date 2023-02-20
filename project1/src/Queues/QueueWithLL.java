package Queues;

public class QueueWithLL<T> {

    Node<T> front;
    Node<T> rear;
    int size;

    public QueueWithLL(){
        front = null;
        rear = null;
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void enqueue(T data) {
        Node<T> node = new Node<T>(data);
        if(size==0){
            front = node;
            rear = node;
        }
        size++;
        rear.next = node;
        rear= node;
    }

    public T  dequeue() throws QueueIsEmptyEsxception{
        if(size==0){
            throw new QueueIsEmptyEsxception();
        }
        T temp = front.data;
        size--;
        front =front.next;

        return temp;
    }

    public T front() throws QueueIsEmptyEsxception{
        if(size==0){
            throw new QueueIsEmptyEsxception();
        }
        return front.data;
    }




}
class Node<T>{
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}
