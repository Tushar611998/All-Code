package LeetCode.Arrays;
import java.util.*;
public class ThirdMaxNumber {
    public static int thirdMax(int[] nums) {

        int max =0;
        int arr[] = new int[3];
        Arrays.sort(nums);
        for(int l =0;l<3;l++){
            arr[l] = -1;
        }
        arr[0] = nums[nums.length-1];
        int i =1;
        int j =nums.length-2;
        while(i<3 && j>=0){
            if(nums[j]==arr[i-1]){
                j--;
            }else{
                arr[i]=nums[j];
                i++;
                j--;
            }
        }
        if(arr[arr.length-1] ==-1){
            return arr[0];
        }
        return arr[arr.length-1];


    }

    public static void main(String[] args) {
        int arr[] = {3,3,4,3,4,3,0,3,3};

        int x =thirdMax(arr);
        System.out.println(x);

    }
}
