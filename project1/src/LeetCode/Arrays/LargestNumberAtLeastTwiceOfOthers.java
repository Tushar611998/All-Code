package LeetCode.Arrays;

public class LargestNumberAtLeastTwiceOfOthers {
    public static int dominantIndex(int[] nums) {

        int max = 0;
        int index = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }

        for(int i =0;i<nums.length;i++){
            if(nums[i]==max && i==nums.length-1){
                return index;
            }else if(i==index){
                continue;
            }
            else if(max<2*nums[i]){
                return -1;
            }
        }
        return index;

    }

    public static void main(String[] args) {
        int arr[] ={3,6,1,0};
        int ans = dominantIndex(arr);
        System.out.println(ans);
    }
}
