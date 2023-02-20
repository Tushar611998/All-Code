package TimeComplexity;
import java.util.Arrays;
import java.util.Scanner;

public class FindUniqueElement2 {
    public static int findUnique(int[] arr) {
        int ans =0;
        Arrays.sort(arr);
        for(int i =0;i<arr.length;){
            int j = i +1;
            if(arr.length==1){
                return arr[0];
            }
            else if(i==arr.length-1){
                ans = arr[i];
                return ans;
            }
            else if(arr[i]==arr[j]){
                i = j+1;
                continue;
            }

            else{
                ans = arr[i];
                return ans;
            }

        }

        return ans;
        //Your code goes here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int ans =findUnique(arr);
        System.out.println(ans);
    }
}
