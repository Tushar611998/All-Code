package TimeComplexity;
import java.util.Scanner;
public class RotateAnArray {
    public static void rotate(int[] arr, int d) {
        int ans [] =  new int[arr.length];

        int k =0;
        for(int i =d;i<arr.length;i++){
            ans[k] = arr[i];
            k++;
        }
        for(int i =0;i<d;i++){
            ans[k] = arr[i];
            k++;
        }
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i] + " ");

        }
        System.out.println();
        //Your code goes here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans [] = new int [0];
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            ans = new int[n];
            for(int j = 0;j<ans.length;j++){
                ans[j] = sc.nextInt();
            }

        }
        int d = sc.nextInt();
        rotate(ans,d);
    }

}
