package Queues;

public class QueueUsingArrayUse {
    public static void main(String[] args) throws QueueIsEmptyEsxception, QueueIsFullException {
        QueuesUsingArrays Q = new QueuesUsingArrays();
        for(int i =1;i<=5;i++){
                Q.enqueue(i);
        }
        for(int i =1;i<=5;i++){
            System.out.print(Q.dequeue()+" ");
        }
        System.out.println();
        Q.enqueue(5);
        Q.enqueue(10);
        Q.enqueue(15);
        Q.enqueue(20);
        Q.enqueue(25);
        Q.dequeue();
        Q.enqueue(2);
        for(int i =1;i<=5;i++){
            System.out.print(Q.dequeue() + " ");
        }
        System.out.println();
        Q.enqueue(5);
        Q.enqueue(10);
        Q.enqueue(15);
        Q.enqueue(20);
        Q.enqueue(25);
        Q.enqueue(30);
        Q.enqueue(35);
        Q.enqueue(40);
        Q.enqueue(45);
        int temp = Q.size();
        for(int i = 0;i<temp;i++){
            System.out.print(Q.dequeue()+" ");
        }
    }
}
