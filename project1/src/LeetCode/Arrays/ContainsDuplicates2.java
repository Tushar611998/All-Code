package LeetCode.Arrays;
import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicates2 {
//    Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
public static boolean containsNearbyDuplicate(int[] nums, int k) {

    HashMap<Integer,Integer> ans = new HashMap<>();
    for(int i =0;i<nums.length;i++){
        if(ans.containsKey(nums[i])){
            if(Math.abs(i-ans.get(nums[i]))<=k){
                return true;
            }
            ans.put(nums[i],i);
        }else{
            ans.put(nums[i],i);
        }

    }

//    for(int i =0;i<nums.length-1;i++){
//        for(int j =i+1;j<nums.length;j++){
//            if(nums[i]==nums[j]){
//                if(Math.abs(i-j)<=k){
//                    return true;
//                }
//            }
//        }
//    }






//    Arrays.sort(nums);
//    int i =0;
//    int j = nums.length-1;
//    while(i<j){
//        if(nums[i]==nums[j]){
//            if(Math.abs(i-j)<=k){
//                return true;
//            }
//        }
//        i++;
//        j--;
//
//    }
//    // if(nums[i]!=nums[j]){
//    //     return false;
//    // }
//    // else if(Math.abs(i-j)<=k){
//    //     return true;
//    // }
    return false;

}

    public static void main(String[] args) {
        int arr[] ={1,2,3,1,2,3};
        int k =2;
        boolean ans = containsNearbyDuplicate(arr,k);
        System.out.println(ans);
    }

}
