package PriorityQueue;

import java.util.ArrayList;

public class PQ_Max {
    private ArrayList<Integer> heap;
    public PQ_Max(){
        heap = new ArrayList<Integer>();
    }
    // Complete this class
    boolean isEmpty() {
        return heap.size()==0;
        // Implement the isEmpty() function here
    }

    int getSize() {
        return heap.size();

        // Implement the getSize() function here
    }

    int getMax()   {

        return heap.get(0);
        // Implement the getMax() function here
    }

    void insert(int element) {
        heap.add(element);
        int childIndex = heap.size()-1;
        while(childIndex >0){
            int parentIndex = (childIndex -1)/2;

            if(heap.get(childIndex) > heap.get(parentIndex)){
                int temp = heap.get(parentIndex);
                heap.set(parentIndex,heap.get(childIndex));
                heap.set(childIndex,temp);
            }
            childIndex = parentIndex;
        }
        // Implement the insert() function here
    }

    int removeMax()  {
        int temp = heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.set(heap.size()-1,temp);
        heap.remove(heap.size()-1);

        for(int i = 0;i<heap.size()-1;i++){
            int parentIndex = i;
            int leftChild = 2*i + 1;
            int rightChild = 2*i +2;

            if(leftChild<heap.size() && heap.get(leftChild)> heap.get(parentIndex)){
                int ans = heap.get(parentIndex);
                heap.set(parentIndex,heap.get(leftChild));
                heap.set(leftChild,ans);
            }if(rightChild<heap.size() && heap.get(rightChild)>heap.get(parentIndex)){
                int ans = heap.get(parentIndex);
                heap.set(parentIndex,heap.get(rightChild));
                heap.set(rightChild,ans);
            }
        }
        return temp;
        // Implement the removeMax() function here
    }
}
