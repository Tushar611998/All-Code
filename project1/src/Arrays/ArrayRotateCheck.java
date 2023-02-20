package Arrays;
import java.util.Scanner;
public class ArrayRotateCheck {
    public static int  arrayRotateCheck(int[] arr) {
        int count =0;
        int j =1;
        if (arr.length==0){
            return 0;
        }
        for (int i =0;i<arr.length && j < arr.length;i++,j++){
            if (arr[j]>=arr[i]){
                count = count+1;
            }
            else if (arr[j]<arr[i]){
                break;
            }

        }
        if (count ==arr.length-1){
            return 0;
        }
        return count+1;


    }


    public static int[] takingInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iteration = sc.nextInt();
        for (int s = 0; s < iteration; s++) {


            int arr[] = takingInput();

            int d =arrayRotateCheck(arr);

            System.out.println(d);


        }
    }

}
