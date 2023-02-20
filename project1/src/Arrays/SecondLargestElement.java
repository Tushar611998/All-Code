package Arrays;
import java.util.Scanner;
public class SecondLargestElement {
    public static int  secondLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for (int i =0; i<arr.length;i++){
            if (arr[i]>largest){
                secondlargest=largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]<largest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;

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

            int d =secondLargestElement(arr);

            System.out.println(d);


        }
    }
}

