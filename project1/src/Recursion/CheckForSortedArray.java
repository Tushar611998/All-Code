package Recursion;

public class CheckForSortedArray {

    public static boolean sorted(int arr[]){
        if (arr.length ==0 || arr.length == 1){
            return true;
        }
          int []arr2 = new int[arr.length-1];
        for(int i =1;i<arr.length;i++){
            arr2[i-1] = arr[i];
        }
        boolean smallans = sorted(arr2);
        if(!smallans){
            return false;
        }
        if(arr[0]<= arr[1]){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 8, 8};
        boolean a =sorted(arr);
        System.out.println(a);
    }
}
