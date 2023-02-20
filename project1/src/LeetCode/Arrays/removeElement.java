package LeetCode.Arrays;

public class removeElement {
    public static int removeElement(int[] nums, int val) {

        for(int i = 0;i<nums.length;i++){
            if(nums[i] == val){
                nums[i] = Integer.MIN_VALUE;
            }
        }
        int count=0;


        int i =0;
        int j = nums.length-1;

        while(i<j){
            if(nums[i]>=0){
                // count++;
                i++;
            }else if(nums[j]<0){
                j--;
            }else{
                int temp = nums[i];
                nums[i]  = nums[j];
                nums[j] = temp;
                // count++;
                i++;
                j--;
            }
        }
        for(int k =0;k<nums.length;k++){
            if(nums[k] >=0){
                count++;
            }
        }
        return count;


    }

    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        int ans = removeElement(arr,3);
        for(int i =0;i<ans;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
