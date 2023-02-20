package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SummeryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length==0){
            return ans;
        }
        if(nums.length==1){
            String an  = nums[0]+"";
            ans.add(an);
            return ans;
        }
        for(int i =0;i<nums.length-1;i++){
            int a =nums[i];
            int b = nums[i];
            int j =i+1;
            while(j<nums.length && (nums[j]-nums[i]==1 || nums[j]-nums[i]==0 ) ){
                j++;
                i++;
                b =nums[i];
            }
            String ab ="";
//            if(j==nums.length-1 && (nums[j]-nums[i]!=1 || nums[j]-nums[i]!=0)){
//                ab= nums[j]+"";
//            }
            if(a==b){
                ab= a+"";
            }else{
                ab = a + "->"+b;
            }

            ans.add(ab);
        }
        String ab ="";
        if((nums[nums.length-1]-nums[nums.length-2] !=1 && nums[nums.length-1]-nums[nums.length-2] !=0)){
            ab = nums[nums.length-1]+"";
            ans.add(ab);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {-1};
        List<String> ans = summaryRanges(arr);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
