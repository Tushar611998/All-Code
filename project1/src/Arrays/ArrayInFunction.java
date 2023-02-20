package Arrays;
import java.util.Scanner;

public class ArrayInFunction {
    public static int[] takingInput() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int input[] = new int[length];
        for (int i = 0; i < length; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }

    public static void print(int input[]) {
        int length = input.length;
        for (int i = 0; i < length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = takingInput();
        print(arr);
    }
}
