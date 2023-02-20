package Arrays;
import java.util.Scanner;
public class SumOfTwoArrays {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int i =0;
        int k =0;
        int carry =0;
        for(int j =output.length-1; j >0;j--) {
            int temp =0;
            if (i >= arr2.length && i < arr1.length) {
                temp=(arr1[arr1.length - 1 - i]+carry);
                output[j] = temp%10;
                carry = temp/10;
            } else if (k >= arr1.length && k < arr2.length) {
                temp =(arr2[arr2.length - 1 - k]+carry);
                output[j] = temp%10;
                carry = temp/10;
            } else {
                temp = (arr1[arr1.length - 1 - i]) + (arr2[arr2.length - 1 - k]) + carry;
                output[j] = temp % 10;
                carry = temp / 10;


            }
            i++;
            k++;

        }
        output[0]=carry;
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


            int arr1[] = takingInput();
            int arr2[] = takingInput();
            int output[] = takingInput();

            sumOfTwoArrays(arr1,arr2,output);
            for (int i =0;i<output.length;i++){
                System.out.print(output[i]+" ");
            }




        }
    }

}
