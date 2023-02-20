package TimeComplexity;
import java.util.Scanner;
import java.util.Arrays;
public class DuplicatesInArray {
    public static int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        int num =0;
        if(arr.length<=1){
            return 0;
        }

        for(int i = 0;i<arr.length-1;i++){
            num = arr[i];
            int j =i+1;
            if(num ==arr[j]){
                num = arr[j];
                return num;
            }
        }
        return num;
        //Your code goes here
    }

}
