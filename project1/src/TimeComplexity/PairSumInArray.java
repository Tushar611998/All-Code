package TimeComplexity;
import java.util.Scanner;
import java.util.Arrays;
public class PairSumInArray {
    public static int pairSum(int[] arr, int num) {
        int count =0;

        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == num){
                    count = count+1;

                }
            }
        }
        return count;

        //Your code goes here
    }
}
