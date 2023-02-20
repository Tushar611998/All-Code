package LeetCode.Arrays;

public class DuplicateAllZerosAndShiftToRight {
    public static void duplicateZeros(int[] arr) {

        int ans [] = new int[arr.length];
        int index = 0;
        int i =0;
        for(;i<arr.length;i++){

            if(i==arr.length-1 || index==arr.length){
                break;
            }

            if(arr[i]==0){
                ans[index] = arr[i];
                ans[index+1] = arr[i];
                index= index+1;
            }else{
                ans[index] =arr[i];
            }
            index++;

        }
//        if(arr[i]!=0){
//            ans.
//        }

        for(int j =0;j<arr.length;j++){
            arr[j] = ans[j];
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
