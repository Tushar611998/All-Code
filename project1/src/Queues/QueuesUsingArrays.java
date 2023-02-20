package Queues;

public class QueuesUsingArrays {
    private int data [];
    private int front ;
    private int rear;
    private int size;


    public QueuesUsingArrays(){
        data = new int[10];
        front = -1;
        rear =-1;
        size = 0;
    }

    public QueuesUsingArrays(int capacity){
        data = new int[capacity];
        front = 0;
        rear =-1;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public int front() throws QueueIsEmptyEsxception {
        if(size==0){
            QueueIsEmptyEsxception e = new QueueIsEmptyEsxception();
            throw e;
        }
        return data[front];
    }

    public void enqueue(int element) {
        if(size==data.length){
           int temp[] = data;
           int k = 0;
           for(int i = front;i<temp.length;i++){
               data[k] = temp[i];
           }
           for(int i = 0;i<front-1;i++){
               data[k] = temp[i];
           }
        }
        if(size==0){
            rear = -1;
            front = 0;
        }
        rear++;
        size++;
        if(rear==data.length){
            rear=0;
        }
        data[rear] = element;

    }

    public int dequeue() throws QueueIsEmptyEsxception {
        if(size==0){
            QueueIsEmptyEsxception e = new QueueIsEmptyEsxception();
            throw e;
        }
        int temp = data[front];
        front++;
        size--;
        if(front== data.length){
            front =0;
        }

        return temp;
    }
}
