package PriorityQueue;

public class implacePriorityQueue {
    public static void virtualHeap(int arr[], int i){
        int childIndex = i;
        int parentIndex = (childIndex-1)/2;
        while(childIndex>0){

            if(arr[childIndex]<arr[parentIndex]){
                int temp = arr[parentIndex];
                arr[parentIndex] = arr[childIndex];
                arr[childIndex] = temp;
                childIndex = parentIndex;
                parentIndex = (childIndex-1)/2;

            }else{
                return;
            }
        }
    }

    public static int delete(int[]arr,int size){
        int temp = arr[0];
        arr[0] = arr[size];
        arr[size] = temp;
        size--;

        int index = 0;
        int minIndex = index;
        int left = 1;
        int right = 2;

        while(left<=size){
            if(arr[left]<arr[minIndex]){
                minIndex = left;
            }
            if( right < size && arr[right]<arr[minIndex]){
                minIndex = right;
            }

            if(minIndex==index){
                break;
            }
            else{
                int temp1 = arr[minIndex];
                arr[minIndex] = arr[index];
                arr[index] = temp1;
                index = minIndex;
                left = 2*index+1;
                right = 2*index +2;
            }
        }
        return temp;
    }

    public static void inplaceHeapSort(int arr[]) {

        for(int i = 0;i<arr.length;i++){
            virtualHeap(arr,i);
        }

        for(int i = 0;i<arr.length;i++){
            arr[arr.length-1-i] = delete(arr,arr.length-1-i);
        }



    }

    public static void main(String[] args) {
        int arr[] = {2,6,8,5,4,3};
        inplaceHeapSort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
