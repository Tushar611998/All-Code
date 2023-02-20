package TimeComplexity;
import java.util.Scanner;
import java.util.Arrays;
public class FindUniqueElementWithXOR {
    public static int findUnique(int [] arr){
        int XOR = 0;
        for(int i=0;i <arr.length;i++){
            XOR = XOR^arr[i];
        }
        return XOR;
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
