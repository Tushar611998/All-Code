package PriorityQueue;

import java.util.ArrayList;

public class PQ_Min {

    private ArrayList<Integer> heap;
    public PQ_Min(){
        heap = new ArrayList<>();
    }

    public int size(){
        return heap.size();
    }
    public boolean isEmpty(){
        return heap.size()==0;
    }
    public int getMin(){
        return heap.get(0);

    }
    public void insert(int element){
        heap.add(element);
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;

        while (childIndex > 0) {
            if (heap.get(childIndex) < heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }
    }

    int removeMin() {
        int temp = heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.set(heap.size()-1,temp);

        heap.remove(heap.size()-1);



        for(int i = 0;i<heap.size();i++){
            int parent = i;
            int leftChild = (2*i+1);
            int rightChild = (2*i+2);

            if(leftChild<heap.size() && heap.get(leftChild)<heap.get(parent)){
                int ans = heap.get(parent);
                heap.set(parent,heap.get(leftChild));
                heap.set(leftChild,ans);


            } if( rightChild< heap.size() && heap.get(rightChild)<heap.get(parent)){
                int ans = heap.get(parent);
                heap.set(parent,heap.get(rightChild));
                heap.set(rightChild,ans);
            }

        }
        return temp;

        // Complete this function
        // Throw the exception PriorityQueueException if queue is empty

    }
}
