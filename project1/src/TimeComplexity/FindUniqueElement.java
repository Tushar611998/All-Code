package TimeComplexity;

import java.util.Scanner;
import java.util.Arrays;

public class FindUniqueElement {

    // this program runs fine but it has time complexity of O(n^2)
    // for better time complexity we need to use XOR function
    public static int findUnique(int[] arr) {
        Arrays.sort(arr);
        int num = 0;
        if (arr.length == 1) {
            return arr[0];
        }

//        for(int i =0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
        for(int i=0;i<arr.length;i++){
            num = arr[i];
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]==0){
                    continue;
                }
                else if(arr[i]==0){
                    break;
                }
                else if(arr[i]==arr[j]){
//                    index = j;
                    arr[j]=0;
                    break;
                }
                else if (j==arr.length-1){
                    return num;
                }
            }
        }
        return num;
        //Your code goes here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] arr = new int[0];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

        }
        int ans = findUnique(arr);
        System.out.println(ans);

    }
}
