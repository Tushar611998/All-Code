package Arrays;
import java.util.Scanner;
public class SumOfArrayWithFunction {
    public static int sum(int input[]){
        int max = 0;
        for (int i =0; i<input.length;i++){

            max= max +input[i];

        }
        return max;



    }
    public static int[] takingInput() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int input[]= new int [length];
        for (int i = 0; i < length; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }
    public static void print(int input[]){
        int length = input.length;
        for (int i=0;i<length;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int iteration = sc.nextInt();
        int arr[] = takingInput();
        int largest = sum(arr);
        System.out.println(largest);



    }

}
