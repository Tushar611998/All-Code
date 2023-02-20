package DSA_Test2;

public class DequeueClass {

    private int data[];
    private int front;
    private int rear;
    int size ;
    public static final int x = 10;

    public DequeueClass(){
        data = new int[x];
        front =-1;
        rear =0;
        size = 0;
    }

    public void insertFront(int element){
        if(size==data.length){
            System.out.println(-1);
            return;
        }
        if(front==-1){
            front = 0;
            rear=0;

        }
        else if(front==0){
            front = data.length-1;
        }else{
            front--;
        }
        size++;
        data[front] = element;
    }

    public void insertRear(int element){
        if(size==data.length){
            System.out.println(-1);
            return;
        }
        if(front==-1){
            front = 0;
            rear = 0;
        }
        else if(rear == data.length-1){
            rear = 0;
        }
        else{
            rear++;
        }
        size++;
        data[rear] = element;

    }
    public void deleteFront(){
        if(size==0){
            System.out.println(-1);
            return;
        }
        if(front==rear){
            front = -1;
            rear = -1;
        }
        else{
            front++;
        }
        size--;

    }

    public void deleteRear(){
        if(size==0){
            System.out.println(-1);
            return;
        }
        if(front==rear){
            front = -1;
            rear = -1;
        }else{
            rear--;
        }
        size--;
    }

    public int getFront(){
        if (size==0)
        {
            return -1 ;
        }
        return data[front];
    }

    public int getrear(){
        if (size==0)
        {
            return -1 ;
        }
        return data[rear];
    }
}
