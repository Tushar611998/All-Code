package Special;
import java.util.Scanner;
import java.util.*;
public class Solution {
    public static int[] fibonacci(int input1){
        int a =1;
        int b =1;
        int c = a+b;
        int ans [] = new int[input1];
        int k=0;
        ans [k++] = a;
        ans [k++] = b;
        for(int i=0;i<ans.length && k<ans.length;i++){
            ans[k] = ans[i] + ans[i+1];
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int [] series = fibonacci(Integer.parseInt(input));
        for(int i =0;i<series.length;i++){
            System.out.print(series[i]);
            if(i< series.length-1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
