package LeetCode.TwoPointers;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {

        int ans [] = new int[2];
        int i=0;
        int j = numbers.length-1;
        while(true){
            ans[0]= i+1;
            if(target-numbers[i]==numbers[j]){
                ans[1] = j+1;
                return ans;
            }else if(target-numbers[i] <numbers[j]){
                j--;
            }else if(target-numbers[i] >numbers[j]){
                i++;
            }
            else if(j==i){
                i++;
                j = numbers.length-1;
            }

        }


    }

    public static void main(String[] args) {
        int ans[] = {2,3,4,5,6,7,8,9};
        int target = 13;
        int a []=twoSum(ans,target);
        System.out.print(a[0]+" "+a[1]);

    }
}
