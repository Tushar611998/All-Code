package LeetCode.Arrays;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {


        for(int i =0;i<nums.length;i++){
            int sumleft =0;
            int sumright = 0;
            for(int j =0;j<i;j++){
                sumleft+=nums[j];
            }

            for(int k = i+1;k<nums.length;k++){
                sumright+= nums[k];
            }

            if(sumleft==sumright){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};
        int ans = pivotIndex(arr);
        System.out.println(ans);
    }

}
