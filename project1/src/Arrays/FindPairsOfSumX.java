package Arrays;
import java.util.Scanner;
public class FindPairsOfSumX {
    public static int[] takingInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        return arr;
    }

    public static int pairSum(int arr[], int x) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];

            for (int j = i; j < arr.length; j++) {
                if(i==j){
                    continue;
                }
                else if (arr[j] + temp == x) {
                    count = count + 1;

                } else {
                    continue;
                }
            }
        }
        return count;
    }


    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int iteration = sc.nextInt();
        int arr[] = takingInput();
        int x = sc.nextInt();
        int j = pairSum(arr,x);
        System.out.println(j);


    }
}

